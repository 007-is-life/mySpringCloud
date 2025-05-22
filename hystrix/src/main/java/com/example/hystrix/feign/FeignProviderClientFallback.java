package com.example.hystrix.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignProviderClientFallback implements FeignProviderClient {
    @Override
    public String findAll() {
        return "获取findAll失败";
    }

    @Override
    public String getPort() {
        return "获取端口失败";
    }
}
