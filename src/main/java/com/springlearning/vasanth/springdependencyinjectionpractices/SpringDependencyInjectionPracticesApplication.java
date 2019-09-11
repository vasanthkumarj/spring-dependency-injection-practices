package com.springlearning.vasanth.springdependencyinjectionpractices;


import com.springlearning.vasanth.springdependencyinjectionpractices.controllers.ConstructorInjectController;
import com.springlearning.vasanth.springdependencyinjectionpractices.controllers.MyController;
import com.springlearning.vasanth.springdependencyinjectionpractices.controllers.PropertyInjectController;
import com.springlearning.vasanth.springdependencyinjectionpractices.controllers.SetterInjectController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringDependencyInjectionPracticesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = run(SpringDependencyInjectionPracticesApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        myController.displayHello();
        System.out.println(ctx.getBean(PropertyInjectController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectController.class).sayHello());
    }

}
