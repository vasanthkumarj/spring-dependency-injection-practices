package com.springlearning.vasanth.springdependencyinjectionpractices.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingByeServiceImpl  {
    private static final String GREET_BYE="Bye!!!";

    public String sayHello() {
        return GREET_BYE;
    }
}
