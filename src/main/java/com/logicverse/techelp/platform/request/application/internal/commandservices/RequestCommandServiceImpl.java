package com.logicverse.techelp.platform.request.application.internal.commandservices;

import com.logicverse.techelp.platform.repairing.infrastructure.persistence.jpa.repositories.TechnicalRepository;
import com.logicverse.techelp.platform.request.domain.model.commands.CreateRequestCommand;
import com.logicverse.techelp.platform.request.domain.services.RequestCommandService;
import com.logicverse.techelp.platform.request.infrestructure.persistence.jpa.repositories.RequestRepository;

public class RequestCommandServiceImpl implements RequestCommandService {
    private RequestRepository requestRepository;
    private TechnicalRepository technicalRepository;

    public RequestCommandServiceImpl(RequestRepository requestRepository, TechnicalRepository technicalRepository){
        this.requestRepository=requestRepository;
        this.technicalRepository=technicalRepository;
    }

    @Override
    public Long handle(CreateRequestCommand command) {
        return null;
    }


}
