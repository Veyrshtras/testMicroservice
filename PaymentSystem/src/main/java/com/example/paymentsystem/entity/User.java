package com.example.paymentsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "system_user")
public class User extends BaseEntity{

    @Column(unique = true)
    private String username;

    private String password;

    private boolean enabled;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn
    private List<Role> role;
}
