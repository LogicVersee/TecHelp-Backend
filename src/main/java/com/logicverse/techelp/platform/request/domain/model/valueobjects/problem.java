package com.logicverse.techelp.platform.request.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record problem(String problem) {

    public problem(){this(null);}

    public problem{
        if(problem==null||problem.isBlank()){
            throw new IllegalArgumentException("Problem cannot be null or blank");
        }
    }

    public String getProblem() {
        return String.format("%s", problem);
    }
}
