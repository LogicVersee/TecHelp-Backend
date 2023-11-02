package com.logicverse.techelp.platform.tasking.application.internal.commandservices;

import com.logicverse.techelp.platform.tasking.domain.model.commands.CreateTaskCommand;
import com.logicverse.techelp.platform.tasking.domain.services.TaskCommandService;
import com.logicverse.techelp.platform.tasking.infrestructure.persistence.jpa.repositories.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskCommandServiceImpl implements TaskCommandService {
    private TaskRepository taskRepository;

    public TaskCommandServiceImpl(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    @Override
    public  Long handle(CreateTaskCommand command){

    }
}
