package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * TestController
 *
 * @author WuYuxiang
 * @date 2018/9/20
 */
@RestController
@RequestMapping("/")
public class TestController {
    @RequestMapping("springboot")
    public String testSpringBoot() {
        String rtString;
        rtString = "hello world";
        return rtString;
    }
}