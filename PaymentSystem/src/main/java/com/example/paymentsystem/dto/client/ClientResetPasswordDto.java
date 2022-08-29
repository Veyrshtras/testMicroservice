package com.example.paymentsystem.dto.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientResetPasswordDto extends ClientLoginDto {

    private String confirmPassword;
    private String token;
}
