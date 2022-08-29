package com.example.paymentsystem.entity;

import com.example.paymentsystem.dto.enums.BillStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Bill extends BaseEntity {

    private String businessName;
    private String image;


    @Enumerated(EnumType.STRING)
    private BillStatus status;

    private Double billAmount;
    private Double approvedAmount;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn
    private PayTackUser payTackUser;
}
