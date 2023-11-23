package com.logicverse.techelp.platform.request.domain.model.valueobjects;

import jakarta.persistence.Embeddable;


@Embeddable
public record specification(String specification) {

    public specification(){this(null);}

    public specification{
        if(specification==null||specification.isBlank()){
            throw new IllegalArgumentException("Specification cannot be null or blank");
        }
    }

    public String getSpecification() {
        return String.format("%s", specification);
    }
}