package com.logicverse.techelp.platform.tasking.domain.model.valueobjects;

public record ClientName(String client_name) {
    public ClientName(){
        this(null);
    }

    public ClientName {
        if (client_name == null || client_name.isBlank()) {
            throw new IllegalArgumentException("Client name cannot be null or blank");
        }
    }

    public String getClientName() {
        return String.format("%s %s", client_name);
    }
}
