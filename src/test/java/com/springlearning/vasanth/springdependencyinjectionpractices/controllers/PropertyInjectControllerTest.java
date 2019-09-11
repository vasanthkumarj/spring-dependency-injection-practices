package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingHelloServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PropertyInjectControllerTest {

    private PropertyInjectController propertyInjectController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectController = new PropertyInjectController();
        this.propertyInjectController.greetingService = new GreetingHelloServiceImpl();
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(GreetingHelloServiceImpl.GREET_HELLO,propertyInjectController.sayHello());
    }
}