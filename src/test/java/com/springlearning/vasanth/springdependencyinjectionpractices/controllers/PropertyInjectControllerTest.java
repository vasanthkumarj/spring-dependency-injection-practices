package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PropertyInjectControllerTest {

    private PropertyInjectController propertyInjectController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectController = new PropertyInjectController();
        this.propertyInjectController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(GreetingServiceImpl.GREET_HELLO,propertyInjectController.sayHello());
    }
}