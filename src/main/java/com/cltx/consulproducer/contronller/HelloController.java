package com.cltx.consulproducer.contronller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shileichao on 2018/9/5.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello consul producer one");
        return "hello consul producer one";
    }
}
