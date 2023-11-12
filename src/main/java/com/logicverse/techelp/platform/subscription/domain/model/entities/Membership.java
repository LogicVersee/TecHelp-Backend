package com.logicverse.techelp.platform.subscription.domain.model.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.apache.logging.log4j.util.Strings;

@Getter
@Entity

public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;


    public Membership() {
        this.title = Strings.EMPTY;
        this.description = Strings.EMPTY;
    }
    public Membership(String title, String description) {
        this();
        this.title = title;
        this.description = description;
    }


    public Membership updateInformation(String title, String description) {
        this.title = title;
        this.description = description;
        return this;
    }

}
