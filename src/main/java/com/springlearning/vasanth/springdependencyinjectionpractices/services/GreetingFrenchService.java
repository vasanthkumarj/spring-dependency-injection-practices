package com.springlearning.vasanth.springdependencyinjectionpractices.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("fr")
public class GreetingFrenchService implements GreetingService {
    private static final String GREET_FRENCH="Bonjour";
    @Override
    public String sayHello() {
        return GREET_FRENCH;
    }
}
