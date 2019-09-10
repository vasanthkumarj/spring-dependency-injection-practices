package com.springlearning.vasanth.springdependencyinjectionpractices.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String GREET_HELLO="Hello!!!";

    @Override
    public String sayHello() {
        return GREET_HELLO;
    }
}
