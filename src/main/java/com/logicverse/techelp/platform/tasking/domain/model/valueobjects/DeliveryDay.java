package com.logicverse.techelp.platform.tasking.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.util.Date;
@Embeddable
public record DeliveryDay(Date delivery_day) {
    public DeliveryDay(){this(null);}

    public DeliveryDay {
        if (delivery_day == null) {
            throw new IllegalArgumentException("Date cannot be null or blank");
        }
    }

    public String getDeliveryDay() {
        return String.format("%s", delivery_day);
    }
}
