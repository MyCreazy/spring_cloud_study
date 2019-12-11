package com.tjh.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//这里面的属性有可能会更新的，git中的配置中心变化的话就要刷新，没有这个注解内，配置就不能及时更新
@RefreshScope
@Configuration
@RequestMapping("/v1")
public class TestController {
    @Value("${nametmp}")
    private String name;

    @GetMapping(path = "/test")
    public String getName() {
        return this.name + " 您好!";
    }
}
