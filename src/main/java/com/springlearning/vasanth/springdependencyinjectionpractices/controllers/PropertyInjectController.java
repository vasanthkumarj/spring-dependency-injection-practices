package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectController {

    GreetingServiceImpl greetingService;

    public String sayHello()
    {
        return greetingService.sayHello();
    }

}
