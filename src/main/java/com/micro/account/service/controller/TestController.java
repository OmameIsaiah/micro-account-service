package com.micro.account.service.controller;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Cacheable
@CacheConfig(cacheNames = "account_test")
@RequestMapping(value = "/")
public class TestController {

    @GetMapping("")
    public String getName() {
        return "Account Micro Service";
    }

    @PostMapping("")
    public String postName() {
        return "Account Micro Service";
    }
}
