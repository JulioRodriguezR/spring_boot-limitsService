package com.juliorodriguez.microservices.limitsservice.controller;

import com.juliorodriguez.microservices.limitsservice.bean.Limits;
import com.juliorodriguez.microservices.limitsservice.configuration.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

  @Autowired()
  Configuration configuration;

  @GetMapping("/limits")
  public Limits retrieveLimits() {
    return new Limits(configuration.getMinium(), configuration.getMaximum());
  }

}
