package com.example.paymentsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Role extends BaseEntity {

    private String name;

    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn
    private List<Permission> permissions;
}
