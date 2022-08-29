package com.example.paymentsystem.entity;

import com.example.paymentsystem.dto.enums.AccountType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class PaymentData extends BaseEntity{


    private String iban;//international bank account number
    private String accountHolder;
    private String accountNumber;
    private String cardNumber;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private Boolean isActive;
    private Long payTackUserId;

}
