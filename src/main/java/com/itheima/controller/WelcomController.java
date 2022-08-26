package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fyd
 * @version 1.0.0
 * 2022/8/26 14:46
 */
@RestController
public class WelcomController {


    @GetMapping()
    public Object index(){
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        return "hello spring boot ";
    }

}
