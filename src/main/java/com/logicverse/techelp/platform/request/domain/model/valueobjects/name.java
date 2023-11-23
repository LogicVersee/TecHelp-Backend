package com.logicverse.techelp.platform.request.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record name(String name) {
    public name(){this(null);}

    public name{
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
    }

    public String getName() {
        return String.format("%s", name);
    }
}
