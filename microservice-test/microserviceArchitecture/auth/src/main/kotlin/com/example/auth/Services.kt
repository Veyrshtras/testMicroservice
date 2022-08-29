package com.example.auth

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService: UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {
        val user=User(1, username!!, BCryptPasswordEncoder().encode("12345678"))
        return CustomUserDetails(user)
    }
}