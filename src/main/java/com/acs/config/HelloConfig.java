package com.acs.config;

import com.acs.services.HelloWorldFactory;
import com.acs.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {


    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile({"default","english"})
    @Primary
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("en");
    }

    @Bean(name="french")
//    @Profile("french")
    public HelloWorldService helloWorldServiceFrench(){
        return helloWorldFactory().createHelloWorldService("fr");
    }
}
