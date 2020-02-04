package com.zjh.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/3 12:31
 */
@RestController
public class AppController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(String name){
        return "hello!" + name + port;
    }

    @GetMapping("/getStudentClassById")
    public String getStudentClassById(int id){
        if (id == 1){
            return "class:01:" + port;
        }
        else {
            return "class:02:" + port;
        }
    }
}
