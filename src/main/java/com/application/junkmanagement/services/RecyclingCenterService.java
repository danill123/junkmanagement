package com.application.junkmanagement.services;

import com.application.junkmanagement.Repository.RecyclingCenterRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecyclingCenterService {

    @Autowired
    RecyclingCenterRepositoy recyclingCenterRepositoy;
}
