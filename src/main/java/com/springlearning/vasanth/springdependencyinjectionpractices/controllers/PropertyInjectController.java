package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingHelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectController {

    @Autowired
    GreetingHelloServiceImpl greetingService;

    public String sayHello()
    {
        return greetingService.sayHello();
    }

}
