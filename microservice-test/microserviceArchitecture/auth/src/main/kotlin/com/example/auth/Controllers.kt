package com.example.auth

import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController {

    @GetMapping("me")
    fun me(authentication: OAuth2Authentication):Map<String, Any>{

        val userDetail=authentication.userAuthentication.principal as CustomUserDetails
        return mapOf("name" to userDetail.username, "userId" to userDetail.user.id)
    }

}