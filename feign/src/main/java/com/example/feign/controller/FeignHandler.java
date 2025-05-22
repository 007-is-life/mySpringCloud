package com.example.feign.controller;

import com.example.feign.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

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
