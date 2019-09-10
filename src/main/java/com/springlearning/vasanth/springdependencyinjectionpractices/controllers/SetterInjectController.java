package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingService;

public class SetterInjectController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    public void setGreetingService(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
