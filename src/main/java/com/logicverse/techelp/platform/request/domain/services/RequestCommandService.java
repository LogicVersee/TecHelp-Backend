package com.logicverse.techelp.platform.request.domain.services;

import com.logicverse.techelp.platform.request.domain.model.commands.CreateRequestCommand;

public interface RequestCommandService {

    Long handle(CreateRequestCommand command);
}
