package com.reed.ustc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * created by reedfan on 2019/1/12 0012
 */

@SpringBootApplication
@EnableEurekaClient
public class Provider8003 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8003.class,args);
    }
}
