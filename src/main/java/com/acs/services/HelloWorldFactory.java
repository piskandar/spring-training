package com.acs.services;

/**
 * Created by piskandar on 2016-04-10.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;

        switch (language){
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "en":
            default:
                service = new HelloWorldServiceEnglishImpl();
                break;
        }

        return service;
    }
}
