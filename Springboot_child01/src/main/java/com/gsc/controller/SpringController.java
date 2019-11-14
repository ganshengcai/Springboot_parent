package com.gsc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//如果每个功能返回的都是Restful内容，那么可以使用该注解
@RestController
public class SpringController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/hello")
//    @ResponseBody
    public String yes() {
        return "hello";
    }

    @RequestMapping("/ok")
    public String ok() {
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志rrrr");
        return "ok";
    }

    //支持Rest风格
    @RequestMapping("/info/{msg}")
    public String show(@PathVariable  String msg)  {
        return "show" + msg;
    }
}
