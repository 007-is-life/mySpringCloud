package com.example.hystrix.controller;

import com.example.hystrix.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @RequestMapping("/findAll")
    public String findAll() {
        return feignProviderClient.findAll();
    }

    @RequestMapping("/getPort")
    public String getPort() {
        return feignProviderClient.getPort();
    }
}
