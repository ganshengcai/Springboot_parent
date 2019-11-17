package com.gsc.controller;

import com.gsc.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
public class TestController {
    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/show")
    public String show() {
        return "show";
    }

    @RequestMapping("/async")
    public String asyncTest() throws Exception{
        long start = System.currentTimeMillis();

        Future<String> task1 = asyncService.doTask1();
        Future<String> task2 = asyncService.doTask2();
        Future<String> task3 = asyncService.doTask3();

        int i =0;
        while (true){
            if (task1.isDone() && task2.isDone() && task3.isDone()) {
                break;
            }
            Thread.sleep(1000);
            System.out.println(i++);
        }
        long end = System.currentTimeMillis();
        return "全部执行完成，总耗时："+ (end - start) + "毫秒";
    }
}
