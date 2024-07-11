package com.application.junkmanagement.services;

import com.application.junkmanagement.Repository.UserRepository;
import com.application.junkmanagement.dto.UserAddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserAddressDto> getUserAddress() {
        return userRepository.getUserAddress();
    }
}
