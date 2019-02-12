package com.learn.serviceribbon.controller;

import com.learn.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinjinquan
 * @version v0.0.1
 * @description 测试ribbon
 * @create 2019-02-11 18:15
 * @copyright com.learn
 * @modify yinjinquan
 **/
@RestController
public class HelloControler {


    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }

}
