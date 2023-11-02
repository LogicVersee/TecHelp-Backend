package com.logicverse.techelp.platform.tasking.application.internal.queryservices;

import com.logicverse.techelp.platform.repairing.domain.model.entities.Technical;
import com.logicverse.techelp.platform.repairing.domain.model.queries.GetTechnicalByEmailQuery;
import com.logicverse.techelp.platform.repairing.domain.model.queries.GetTechnicalByIdQuery;
import com.logicverse.techelp.platform.repairing.infrastructure.persistence.jpa.repositories.TechnicalRepository;
import com.logicverse.techelp.platform.tasking.domain.model.entities.Task;
import com.logicverse.techelp.platform.tasking.domain.model.queries.GetTaskByIdQuery;
import com.logicverse.techelp.platform.tasking.domain.services.TaskQueryService;
import com.logicverse.techelp.platform.tasking.infrestructure.persistence.jpa.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaskQueryServiceImpl implements TaskQueryService {

    private TaskRepository taskRepository;

    public TaskQueryServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> handle(GetTaskByIdQuery query){
        return taskRepository.findById(query.taskId());
    }

    @Override
    public List<Task> handle(){return taskRepository.findAll();
    }


}
