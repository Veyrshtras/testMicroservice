package com.example.paymentsystem.dto.client;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClientRegisterDto extends ClientLoginDto {
    private String confirmPassword;
    private String clientName;
    private String countryCode;
    private String phoneNumber;
    private String gender;
    private Date dateOfBirth;
    private Date anniversaryDate;
    private String referralCode;
}
