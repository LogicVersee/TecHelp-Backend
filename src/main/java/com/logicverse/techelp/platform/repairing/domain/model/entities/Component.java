package com.logicverse.techelp.platform.repairing.domain.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Component {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long quantity;
    private double price;
    @ManyToOne
    private DashBoard dashBoard;

    public Component(String name, Long quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Component(){}

    public void updateComponent(String name, Long quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
