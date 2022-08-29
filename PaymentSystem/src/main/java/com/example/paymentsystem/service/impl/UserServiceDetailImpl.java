package com.example.paymentsystem.service.impl;

import com.example.paymentsystem.dto.UserDto;
import com.example.paymentsystem.entity.User;
import com.example.paymentsystem.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceDetailImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserServiceDetailImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user=userRepository.findByUsername(username);

        return user.map(UserDto::new).orElse(null);
    }
}
