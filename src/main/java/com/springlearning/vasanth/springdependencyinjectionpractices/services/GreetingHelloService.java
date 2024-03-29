package com.springlearning.vasanth.springdependencyinjectionpractices.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class GreetingHelloService implements GreetingService {

    public static final String GREET_HELLO="Hello!!!";

    @Override
    public String sayHello() {
        return GREET_HELLO;
    }
}
