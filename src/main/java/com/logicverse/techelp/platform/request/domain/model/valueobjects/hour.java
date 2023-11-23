package com.logicverse.techelp.platform.request.domain.model.valueobjects;

import jakarta.persistence.Embeddable;


@Embeddable
public record hour(String hour) {

    public hour(){this(null);}

    public hour{
        if(hour==null||hour.isBlank()){
            throw new IllegalArgumentException("Hour cannot be null or blank");
        }
    }

    public String getHour() {
        return String.format("%s", hour);
    }
}