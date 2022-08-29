package com.example.paymentsystem.dto.business;

import com.example.paymentsystem.dto.enums.RedeemCondition;
import com.example.paymentsystem.dto.enums.CashbackType;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BusinessCashbackConfigDto {

    private Integer id;
    private CashbackType cashbackType;

    private Double firstCashbackValue;
    private Double subsequentCashbackValue;
    private Double minimumQualifyingAmount;
    private Double maximumQualifyingAmount;
    private Boolean vatExcluded;
    private String image;
    private RedeemCondition redeemCondition;

}
