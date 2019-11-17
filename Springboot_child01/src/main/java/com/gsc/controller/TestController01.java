package com.gsc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

@RestController
public class TestController01 {

    //定义消息转换器
    // @Bean
    // public StringHttpMessageConverter stringHttpMessageConverter() {
    //     StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
    //     return converter;
    // }

    @RequestMapping("/test")
    public String tests() {
        return "hello" + "你好";
    }

}
