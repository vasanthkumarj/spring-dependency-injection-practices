package com.springlearning.vasanth.springdependencyinjectionpractices.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingHelloService implements GreetingService {

    public static final String GREET_HELLO="Hello!!!";

    @Override
    public String sayHello() {
        return GREET_HELLO;
    }
}
