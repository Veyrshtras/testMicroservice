package com.example.lesson4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.swing.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "region")
    private Set<District> districts;
}
