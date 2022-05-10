package com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.service.DemoApi;

/**
 * @ClassName :   DemoApiImpl
 * @Description: T接口实现类
 * @Author: mzl
 * @CreateDate: 2022/5/10 2:34
 * @Version: 1.0
 */
@Service
public class DemoApiImpl implements DemoApi {

    @Override
    public String sayHello(){
        return "Hello World！";
    }

}
