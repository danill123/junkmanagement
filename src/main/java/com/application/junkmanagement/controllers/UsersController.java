package com.application.junkmanagement.controllers;

import com.application.junkmanagement.dto.UserAddressDto;
import com.application.junkmanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UserService userService;

//    @GetMapping
//    public ResponseEntity<String> index() {
//        return ResponseEntity.ok("hello");
//    }
    @GetMapping
    public List<UserAddressDto> index() {
        return userService.getUserAddress();
    }
}
