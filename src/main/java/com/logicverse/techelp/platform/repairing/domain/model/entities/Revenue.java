package com.logicverse.techelp.platform.repairing.domain.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Revenue {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private DashBoard dashBoard;
    private Long income;

    public Revenue(Long income){
        this.income = income;
    }

    public Revenue(){}
}
