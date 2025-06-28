package com.lukacode.microservices.limits_microservice.controller;

import com.lukacode.microservices.limits_microservice.config.Configuration;
import com.lukacode.microservices.limits_microservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LimitsController {
    private final Configuration conf;

    @Autowired
    public LimitsController(Configuration conf) {
        this.conf = conf;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits(){
//        return new Limits(100,9999);
        return new Limits(conf.getMinimum(), conf.getMaximum());
    }
}
