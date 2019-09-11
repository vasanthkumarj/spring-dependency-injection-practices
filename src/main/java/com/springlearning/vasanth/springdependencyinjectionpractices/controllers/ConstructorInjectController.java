package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }


    public ConstructorInjectController(@Qualifier("greetingByeService") final GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
