package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController {

    private GreetingService greetingService;


    public String sayHello() {
        return greetingService.sayHello();
    }

    @Autowired
    //@Qualifier("greetingByeService")
    public void setGreetingService(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
