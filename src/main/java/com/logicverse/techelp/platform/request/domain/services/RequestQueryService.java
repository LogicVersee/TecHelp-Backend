package com.logicverse.techelp.platform.request.domain.services;

import com.logicverse.techelp.platform.request.domain.model.entities.Request;
import com.logicverse.techelp.platform.request.domain.model.queries.PostRequestById;

import java.util.List;
import java.util.Optional;

public interface RequestQueryService {

    Optional<Request> handle(PostRequestById query);
    List <Request> handle();

}
