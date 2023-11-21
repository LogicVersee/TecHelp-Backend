package com.logicverse.techelp.platform.iam.domain.model.aggregates;

import com.logicverse.techelp.platform.iam.domain.model.entities.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.HashSet;
import java.util.Set;

public class User extends AbstractAggregateRoot<User> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotBlank
    @Size(max = 50)
    @Column(unique = true)
    private String username;

    @NotBlank
    @Size(max=120)
    private String password;

    @ManyToMany(fetch =  FetchType.EAGER)
    @JoinTable(name = "user_roles",
    joinColumns = @JoinColumn(name="user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User(){
        roles=new HashSet<>();
    }

    public User(String username, String password, Set<Role> roles){
        this();
        this.username= username;
        this.password=password;
        this.roles=roles;
    }

    public User addRole(Role role){
        this.roles.add(role);
        return this;
    }



}
