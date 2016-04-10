package com.acs.controllers;

import com.acs.services.HelloWorldService;

public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceFrench;

    private HelloWorldService helloWorldServiceGerman;

//    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        System.out.println(helloWorldServiceFrench.getGreeting());
        System.out.println(helloWorldServiceGerman.getGreeting());
        return greeting;
    }

//    @Autowired
//    @Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

//    @Autowired
//    @Qualifier("helloWorldServiceGerman")
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }
}
