package com.springlearning.vasanth.springdependencyinjectionpractices.controllers;

import com.springlearning.vasanth.springdependencyinjectionpractices.services.GreetingHelloServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class SetterInjectControllerTest {

    private SetterInjectController setterInjectController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectController = new SetterInjectController();
        this.setterInjectController.setGreetingService(new GreetingHelloServiceImpl());
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(GreetingHelloServiceImpl.GREET_HELLO, setterInjectController.sayHello());
    }
}