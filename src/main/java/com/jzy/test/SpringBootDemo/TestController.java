package com.jzy.test.SpringBootDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestController {
    @RequestMapping("hello")
    public String hello() {
        return "Hello World!";
    }
}
