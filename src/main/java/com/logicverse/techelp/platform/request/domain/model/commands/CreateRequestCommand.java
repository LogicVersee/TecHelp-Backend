package com.logicverse.techelp.platform.request.domain.model.commands;

import java.util.Date;

public record CreateRequestCommand(
        String name,
        Date day,
        String hour,
        String cellphone,
        String problem,
        String specification)
{
}
