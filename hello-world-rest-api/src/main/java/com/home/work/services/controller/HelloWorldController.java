package com.home.work.services.controller;

import com.home.work.services.beans.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String sayHello(){
        return "Hello-world";
    }

    @GetMapping("say/hello")
    public HelloWorldBean helloMessage(){
        return new HelloWorldBean("Hello Guys.");
    }

    @GetMapping("say/hey")
    public HelloWorldBean heyMessage(){
        return new HelloWorldBean("Hey Folks.");
    }

}
