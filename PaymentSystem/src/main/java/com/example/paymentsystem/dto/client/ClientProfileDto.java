package com.example.paymentsystem.dto.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientProfileDto extends ClientLoginDto {

    private String clientName;
    private String countryCode;
    private String phoneNumber;
    private String gender;
    private String datOfBirth;
    private String anniversaryDate;
    private String referralCode;
}
