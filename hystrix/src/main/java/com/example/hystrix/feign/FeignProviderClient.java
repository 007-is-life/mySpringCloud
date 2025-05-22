package com.example.hystrix.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider", fallback = FeignProviderClientFallback.class)
public interface FeignProviderClient {

    @RequestMapping("/student/findAll")
    String findAll();

    @RequestMapping("/student/getPort")
    String getPort();
}
