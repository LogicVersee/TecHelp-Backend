package com.logicverse.techelp.platform.repairing.domain.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Technical {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    @Lob
    private byte[] photo;
    private String email;
    private String password;

    public Technical(String name, String lastName, String phone, String address, String city, byte[] photo, String email, String password){
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.photo = photo;
        this.email = email;
        this.password = password;
    }

    public Technical(){}
}
