package org.example.ssm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Luolanjiao on 2020/2/25.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
     public String get(){
        return "ok";
    }
}
