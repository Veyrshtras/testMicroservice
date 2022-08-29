package com.example.paymentsystem.dto.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientCashbackDataDto {

    private Double pendingCashback;
    private Double availableCashback;

}
