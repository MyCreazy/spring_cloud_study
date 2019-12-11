package com.tjh.config_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class ConfigServerTestController {

    @GetMapping(path = "/test")
    public String test()
    {
        return  "test success";
    }
}
