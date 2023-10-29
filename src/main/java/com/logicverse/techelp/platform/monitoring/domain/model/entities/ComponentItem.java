package com.logicverse.techelp.platform.monitoring.domain.model.entities;

import com.logicverse.techelp.platform.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class ComponentItem extends AuditableModel {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long quantity;
    private double price;
    @ManyToOne
    private DashBoard dashBoard;

    public ComponentItem(String name, Long quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public ComponentItem(){}

    public void updateComponent(String name, Long quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
