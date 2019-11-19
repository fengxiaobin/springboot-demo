package com.travelsky.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }


    @GetMapping("/hello")
    public String helloGit() {
        return "Hello GitHub SpringBoot!";
    }

    public static void main(String[] args) {
        System.out.println("Hello GitHub !");
    }
    /**
     * 添加测试代码
     *
     *
     * DEVELOPER
     *
     *
     */
}
