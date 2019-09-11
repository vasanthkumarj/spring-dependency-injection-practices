package com.springlearning.vasanth.springdependencyinjectionpractices.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingByeService implements GreetingService  {
    private static final String GREET_BYE="Bye!!!";

    @Override
    public String sayHello() {
        return GREET_BYE;
    }
}
