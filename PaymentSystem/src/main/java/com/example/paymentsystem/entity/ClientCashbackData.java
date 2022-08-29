package com.example.paymentsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ClientCashbackData extends BaseEntity{

    private Double availableCashback;
    private Double pendingCashback;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private PayTackUser payTackUser;

}
