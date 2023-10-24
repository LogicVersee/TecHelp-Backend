package com.logicverse.techelp.platform.repairing.domain.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class DashBoard {
    @Id
    @Getter
    private Long id;

    @OneToMany
    private List<Component> inventory;
    @OneToMany
    private List<Revenue> incomes;

    public DashBoard(){
        this.inventory = new ArrayList<>();
    }

    public void updateInventory(List<Component> inventory){
        this.inventory = inventory;
    }

    public void addIncomePerWeekend(Long income){
        this.incomes.add(new Revenue(income));
    }
}
