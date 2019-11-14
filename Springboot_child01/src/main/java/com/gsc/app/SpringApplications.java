package com.gsc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan("com.gsc.controller")
//默认情况下扫描的是当前包及当前包的子包
@SpringBootApplication(scanBasePackages = {"com.gsc.controller"})
public class SpringApplications {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplications.class);
    }
}
