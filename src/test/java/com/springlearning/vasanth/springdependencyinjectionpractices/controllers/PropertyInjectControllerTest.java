package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingHelloService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PropertyInjectControllerTest {

    private PropertyInjectController propertyInjectController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectController = new PropertyInjectController();
        this.propertyInjectController.greetingService = new GreetingHelloService();
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(GreetingHelloService.GREET_HELLO,propertyInjectController.sayHello());
    }
}