package com.home.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HomeController {

    @Value("${message}")
    public String password;


    @RequestMapping("/greetings")
    public String Display(){
        return "Yes !!!"+ password;
    }
}
