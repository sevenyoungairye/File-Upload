package com.bitqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author echo lovely
 * @date 2020/9/4 22:32
 */
@Controller
public class DemoController {

    @RequestMapping("/test1")
    @ResponseBody
    public void test1() {
        System.out.println("test1...");
    }

}
