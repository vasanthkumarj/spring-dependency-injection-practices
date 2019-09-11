package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingHelloServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ConstructorInjectControllerTest {

    private ConstructorInjectController constructorInjectController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectController = new ConstructorInjectController(new GreetingHelloServiceImpl());
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(GreetingHelloServiceImpl.GREET_HELLO, constructorInjectController.sayHello());
    }
}