package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ConstructorInjectControllerTest {

    private ConstructorInjectController constructorInjectController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectController = new ConstructorInjectController(new GreetingServiceImpl());
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(GreetingServiceImpl.GREET_HELLO, constructorInjectController.sayHello());
    }
}