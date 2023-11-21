package com.logicverse.techelp.platform.iam.domain.model.entities;

import com.logicverse.techelp.platform.iam.domain.model.valueobjects.Roles;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@NoArgsConstructor
@Entity
@Data
@With
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Roles name;

    public Role(Roles name){
            this.name=name;
    }
}
