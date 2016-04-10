package com.acs.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by piskandar on 2016-04-10.
 */
@Service
@Profile("french")
public class HelloWorldServiceFrenchImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Bonjour Monde";
    }
}
