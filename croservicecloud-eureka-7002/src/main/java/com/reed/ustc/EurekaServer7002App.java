package com.reed.ustc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * created by reedfan on 2019/1/12 0012
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002App.class,args);
    }
}
