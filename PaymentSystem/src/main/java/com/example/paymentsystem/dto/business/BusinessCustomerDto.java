package com.example.paymentsystem.dto.business;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessCustomerDto {

    private String customerName;
    private String email;
    private String phoneNumber;
    private Integer age;
    private String gender;
    private String signUpDate;
    private String city;
    private String country;
    private String anniversaryDate;
    private String language;
}
