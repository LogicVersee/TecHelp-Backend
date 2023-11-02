package com.logicverse.techelp.platform.tasking.interfaces.rest;

import com.logicverse.techelp.platform.repairing.domain.model.queries.GetTechnicalByIdQuery;
import com.logicverse.techelp.platform.repairing.interfaces.rest.resources.TechnicalResource;
import com.logicverse.techelp.platform.repairing.interfaces.rest.transform.TechnicalResourceFromEntityAssembler;
import com.logicverse.techelp.platform.tasking.domain.services.TaskCommandService;
import com.logicverse.techelp.platform.tasking.domain.services.TaskQueryService;
import com.logicverse.techelp.platform.tasking.interfaces.rest.resources.CreateTaskResource;
import com.logicverse.techelp.platform.tasking.interfaces.rest.resources.TaskResource;
import com.logicverse.techelp.platform.tasking.interfaces.rest.transform.CreateTaskFromResourceAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
@RequestMapping(value="api/v1/task", produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskController {
    private final TaskQueryService taskQueryService;
    private final TaskCommandService taskCommandService;

    public TaskController(TaskQueryService taskQueryService, TaskCommandService taskCommandService) {
        this.taskQueryService = taskQueryService;
        this.taskCommandService = taskCommandService;
    }


    @PostMapping
    public ResponseEntity<TaskResource> createTask(@RequestBody CreateTaskResource resource) {
        var command = CreateTaskFromResourceAssembler.toCommandFrom(resource);
        var taskId = TaskCommandService.handle(command);

        var query = new GetTechnicalByIdQuery(taskId);
        var technicalByQuery = taskQueryService.handle(query);

        var technicalResource = TechnicalResourceFromEntityAssembler.toResourceFromEntity(technicalByQuery.get());
        return new ResponseEntity<>(technicalResource, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Stream<TechnicalResource>> getTechnicals() {
        var technicals = technicalQueryService.handle();
        if (technicals.isEmpty()) return ResponseEntity.badRequest().build();
        var technicalsResource = technicals.stream().map(technical -> {
            return TechnicalResourceFromEntityAssembler.toResourceFromEntity(technical);
        });
        return ResponseEntity.ok(technicalsResource);
    }
}
