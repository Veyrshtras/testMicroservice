package com.example.auth

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class CustomUserDetails(val user: User): UserDetails {
    override fun getAuthorities()= mutableListOf<GrantedAuthority>()

    override fun getPassword()= user.password

    override fun getUsername()=user.username

    override fun isAccountNonExpired()=true

    override fun isAccountNonLocked()=true

    override fun isCredentialsNonExpired()=true

    override fun isEnabled()=true
}