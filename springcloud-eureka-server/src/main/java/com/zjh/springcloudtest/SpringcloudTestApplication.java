package com.zjh.springcloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTestApplication.class, args);
    }

}
