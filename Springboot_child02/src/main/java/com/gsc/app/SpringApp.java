package com.gsc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.swing.*;

@SpringBootApplication(scanBasePackages = {"com.gsc.controller", "com.gsc.service"})
@EnableAsync//开启异步调用
public class SpringApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}
