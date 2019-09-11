package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    @Autowired
    public void setGreetingService(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
