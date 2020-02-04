package com.zjh.springcloudeurekaclientb.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zjh.springcloudeurekaclientb.service.AppService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/3 13:03
 */
@Service("appService")
public class AppServiceImpl implements AppService {

    @Resource
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "sayHelloFallBack",threadPoolProperties = {
            @HystrixProperty(name = "coreSize",value = "1")
    })
    public String sayHello(String name) {
        return restTemplate.postForEntity("http://clientA:8091/hello?name="+name,null,String.class).getBody();
    }

    private String sayHelloFallBack(String name){
        return "error";
    }
}
