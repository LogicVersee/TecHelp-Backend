package com.logicverse.techelp.platform.tasking.domain.services;

import com.logicverse.techelp.platform.tasking.domain.model.entities.Task;
import com.logicverse.techelp.platform.tasking.domain.model.queries.GetTaskByTechnicalIdQuery;


import java.util.Optional;

public interface TaskQueryService {

    Optional<Task> handle(GetTaskByTechnicalIdQuery query);
}
