package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingHelloService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class SetterInjectControllerTest {

    private SetterInjectController setterInjectController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectController = new SetterInjectController();
        this.setterInjectController.setGreetingService(new GreetingHelloService());
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(GreetingHelloService.GREET_HELLO, setterInjectController.sayHello());
    }
}