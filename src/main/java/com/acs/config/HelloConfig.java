package com.acs.config;

import com.acs.services.HelloWorldService;
import com.acs.services.HelloWorldServiceEnglishImpl;
import com.acs.services.HelloWorldServiceFrenchImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile({"default","english"})
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("french")
    public HelloWorldService helloWorldServiceFrench(){
        return new HelloWorldServiceFrenchImpl();
    }
}
