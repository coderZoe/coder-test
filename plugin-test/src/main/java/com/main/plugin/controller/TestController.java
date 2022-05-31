package com.main.plugin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coderZoe
 * @date 2022/5/31 17:00
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
