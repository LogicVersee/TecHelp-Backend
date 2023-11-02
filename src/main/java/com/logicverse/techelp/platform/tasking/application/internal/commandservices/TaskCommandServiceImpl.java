package com.logicverse.techelp.platform.tasking.application.internal.commandservices;

import com.logicverse.techelp.platform.monitoring.domain.model.valueobjects.TechnicianId;
import com.logicverse.techelp.platform.tasking.domain.model.commands.CreateTaskCommand;
import com.logicverse.techelp.platform.tasking.domain.model.entities.Task;
import com.logicverse.techelp.platform.tasking.domain.model.queries.GetTaskByIdQuery;
import com.logicverse.techelp.platform.tasking.domain.services.TaskCommandService;
import com.logicverse.techelp.platform.tasking.infrestructure.persistence.jpa.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskCommandServiceImpl implements TaskCommandService {
    private TaskRepository taskRepository;

    public TaskCommandServiceImpl(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    @Override
    public  Long handle(CreateTaskCommand command){
        var technicianId =new TechnicianId();
        var task =this.taskRepository.findById(technicianId.technicianId());

        if(task.isEmpty()){
            var newTask = new Task(command.client_name(),command.client_phone(),command.problem(),
                    command.component(),command.delivery_date(),command.income());
            this.taskRepository.save(newTask);

            return newTask.getId();
        }

        throw new IllegalArgumentException("Task already exists");
    }

}
