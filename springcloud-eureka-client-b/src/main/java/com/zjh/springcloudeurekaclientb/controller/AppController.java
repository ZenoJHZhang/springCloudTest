package com.zjh.springcloudeurekaclientb.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zjh.springcloudeurekaclientb.service.AppService;
import com.zjh.springcloudeurekaclientb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/3 13:01
 */
@RestController
public class AppController {


    private final AppService appService;
    private final StudentService studentService;

    @Autowired
    public AppController(AppService appService, StudentService studentService) {
        this.appService = appService;
        this.studentService = studentService;
    }

    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return appService.sayHello(name);
    }

    @RequestMapping("/getStudent")
    public String getStudent(String name){
        return JSON.toJSONString(studentService.getStudent(name));
    }
}
