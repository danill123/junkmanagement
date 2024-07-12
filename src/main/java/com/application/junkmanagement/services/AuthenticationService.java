package com.application.junkmanagement.services;

import com.application.junkmanagement.Repository.UserRepository;
import com.application.junkmanagement.dto.LoginUserDto;
import com.application.junkmanagement.models.Users;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
    }

    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public Users signup(Users input) {
        Users users = new Users();
        users.setPassword(passwordEncoder.encode(input.getPassword()));
        users.setEmail(input.getEmail());
        users.setUsername(input.getUsername());
        users.setRole(input.getRole());

        return userRepository.save(users);
    }

    public Users authentication(LoginUserDto loginUserDto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginUserDto.getEmail(), loginUserDto.getPassword())
        );

        return userRepository.findByEmail(loginUserDto.getEmail()).orElseThrow();
    }
}
