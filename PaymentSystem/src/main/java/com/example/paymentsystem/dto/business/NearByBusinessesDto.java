package com.example.paymentsystem.dto.business;

import com.example.paymentsystem.dto.business.BusinessCashbackConfigDto;
import com.example.paymentsystem.entity.BusinessCashbackConfigNearBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NearByBusinessesDto {
    private String businessName;
    private String category;
    private String countryCode;
    private Double distance;
    private String openingHours;
    private String address;
    private String city;
    private String country;
    private String latitude;
    private String longitude;
    private String logoUrl;
    private String discountPercentage;
    private Boolean isMarketPlace;
    private String phoneNumber;
    private Boolean phoneNumberConfirmed;
    private String postalCode;
    private String registrationNumber;
    private String registrationName;
    private String webSiteUrl;
    private BusinessCashbackConfigNearBy businessCashbackConfig;
}
