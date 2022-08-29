package com.example.paymentsystem.dto.business;

import com.example.paymentsystem.dto.enums.CashbackType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BusinessExtraCashbackConfigDto {

    private CashbackType extraCashbackType;
    private Double extraCashbackValue;
    private Date extraCashbackStart;
    private Date extraCashbackEnd;

}
