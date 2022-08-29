package com.example.paymentsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class PayTackUser extends BaseEntity {

    private String normalizedUserName;
    private String normalizedEmail;
    private Boolean emailConfirmed;
    private String securityStamp;
    private String concurrencyStamp;
    private Boolean phoneNumberConfirmed;
    private Boolean twoFactorEnabled;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockoutEnd;
    private Boolean lockoutEnabled;
    private Integer accessFailedCount;
    private String email;
    private String countryCode;
    private String phoneNumber;
    private String address;
    private String postalCode;
    private String city;
    private String country;
    private String passwordResetToken;
    private Integer passwordResetOTP;
    private String businessName;
    private String category;
    private String description;
    private String logoUrl;
    private String registrationNumber;
    private String registrationName;
    private String openingHours;
    private Boolean isMarketPlace;
    private Boolean isKycCompleted;
    private String latitude;
    private String longitude;
    private String website;
    private String instagramUrl;
    private String facebookUrl;
    private String twitterUrl;
    private String accountName;
    private String accountHolderName;
    private String bankName;
    private String iban;
    private String clientName;
    private String gender;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    @Temporal(TemporalType.TIMESTAMP)
    private Date anniversaryDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date signUpDate;

    @PrePersist
    void changeDate(){
        this.signUpDate=new Date();
    }
    private String referralCode;
}
