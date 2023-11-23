package com.logicverse.techelp.platform.request.domain.model.valueobjects;

import jakarta.persistence.Embeddable;


@Embeddable
public record cellphone(String cellphone) {

    public cellphone(){this(null);}

    public cellphone{
        if(cellphone==null||cellphone.isBlank()){
            throw new IllegalArgumentException("Cellphone cannot be null or blank");
        }
    }

    public String getCellphone() {
        return String.format("%s", cellphone);
    }
}