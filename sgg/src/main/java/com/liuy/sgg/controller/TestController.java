package com.liuy.sgg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： liuy
 * @date： 2023/10/19 20:52
 * @description：测试控制器
 * @version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "sgg success";
    }
}
