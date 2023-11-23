package com.logicverse.techelp.platform.request.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Embeddable
public record day(Date day) {
    public day(){this(null);}

    public day {
        if (day == null) {
            throw new IllegalArgumentException("Day cannot be null or blank");
        }
    }

    public Date getDay() {
        String deliveryDayString = String.valueOf(day);
        Date deliveryDate = null;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {

            deliveryDate = dateFormat.parse(deliveryDayString);
        } catch (ParseException e) {
            e.printStackTrace(); //
        }

        return deliveryDate;
    }
}