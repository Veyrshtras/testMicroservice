package com.example.paymentsystem.dto.enums;

import lombok.Getter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

// pul qaytarish sharti
@Getter
public enum RedeemCondition {

    Anywhere, OnlyAtOurStore
}
