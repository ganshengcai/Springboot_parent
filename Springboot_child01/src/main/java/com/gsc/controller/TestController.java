package com.gsc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/show")
    public String show() {
        logger.debug("debugger日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志日志日志rrrrrrttt");
        return "show";
    }
}
