package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.service.DemoApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :   DemoApiController
 * @Description: TODO
 * @Author: mzl
 * @CreateDate: 2022/5/10 16:08
 * @Version: 1.0
 */
@Controller
@RequestMapping("demoApi")
public class DemoApiController {

    @Reference
    private DemoApi demoApi;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return demoApi.sayHello();
    }

}
