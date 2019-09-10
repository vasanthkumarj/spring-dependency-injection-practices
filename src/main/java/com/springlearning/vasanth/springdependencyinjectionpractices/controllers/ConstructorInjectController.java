package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingService;

public class ConstructorInjectController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    public ConstructorInjectController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
