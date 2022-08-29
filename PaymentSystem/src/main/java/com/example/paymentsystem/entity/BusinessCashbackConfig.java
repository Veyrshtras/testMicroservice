package com.example.paymentsystem.entity;

import com.example.paymentsystem.dto.enums.RedeemCondition;
import com.example.paymentsystem.dto.enums.CashbackType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class BusinessCashbackConfig extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CashbackType cashbackType;

    private Double firstCashbackValue;
    private Double subsequentCashbackValue;
    private Double minimumQualifyingAmount;
    private Double maximumQualifyingAmount;
    private Boolean vatExcluded;
    private String image;
    @Enumerated(EnumType.STRING)
    private RedeemCondition redeemCondition;

    @Enumerated(EnumType.STRING)
    private CashbackType extraCashback;

    private Double extraCashbackValue;
    private Date extraCashbackStart;
    private Date extraCashbackEnd;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private PayTackUser payTackUser;
}
