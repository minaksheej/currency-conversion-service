package com.spring.in28mintutes.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.in28mintutes.limitservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration config;
    
    @GetMapping("/limits")
    public LimitConfiguration retriveLimitFromConfiguration() {
        return new LimitConfiguration(config.getMaximum(), config.getMinimum());

    }

}
