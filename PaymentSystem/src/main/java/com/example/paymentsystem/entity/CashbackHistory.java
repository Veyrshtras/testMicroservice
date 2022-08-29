package com.example.paymentsystem.entity;

import com.example.paymentsystem.dto.enums.CashbackStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class CashbackHistory extends BaseEntity{

    private String clientName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimestamp;

    private Double cashBackAmount;

    @Enumerated(EnumType.STRING)
    private CashbackStatus cashBackStatus;
}
