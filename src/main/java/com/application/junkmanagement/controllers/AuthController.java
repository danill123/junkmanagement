package com.application.junkmanagement.controllers;

import com.application.junkmanagement.dto.LoginResponseDto;
import com.application.junkmanagement.dto.LoginUserDto;
import com.application.junkmanagement.models.Users;
import com.application.junkmanagement.services.AuthenticationService;
import com.application.junkmanagement.services.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final JwtService jwtService;

    public AuthController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<Users> register(@RequestBody Users input) {
        Users registered = authenticationService.signup(input);
        return ResponseEntity.ok(registered);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> authenticate(@RequestBody LoginUserDto loginUserDto) {
        Users athenticateUser = authenticationService.authentication(loginUserDto);

        String jwtToken = jwtService.generateToken(athenticateUser);

        LoginResponseDto loginResponseDto = new LoginResponseDto();
        loginResponseDto.setToken(jwtToken);
        loginResponseDto.setExpiresIn(jwtService.getExpirationTime());
        return ResponseEntity.ok(loginResponseDto);
    }
}
