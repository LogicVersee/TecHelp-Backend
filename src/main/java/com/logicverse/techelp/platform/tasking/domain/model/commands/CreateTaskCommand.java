package com.logicverse.techelp.platform.tasking.domain.model.commands;

public record CreateTaskCommand(String client_name, String client_phone, String problem, String component, String delivery_date, String income) {

}
