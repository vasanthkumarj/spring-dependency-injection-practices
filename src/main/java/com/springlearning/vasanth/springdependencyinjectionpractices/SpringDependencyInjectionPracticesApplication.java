package com.springlearning.vasanth.springdependencyinjectionpractices;


import com.springlearning.vasanth.springdependencyinjectionpractices.controllers.MyController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringDependencyInjectionPracticesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = run(SpringDependencyInjectionPracticesApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        myController.displayHello();
    }

}
