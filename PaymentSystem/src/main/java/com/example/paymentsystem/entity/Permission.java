package com.example.paymentsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Permission extends BaseEntity{

    private String name;

    private String title;

}
