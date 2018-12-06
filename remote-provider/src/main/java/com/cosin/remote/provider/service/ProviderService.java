package com.cosin.remote.provider.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yx
 */
@RequestMapping("api/")
@RestController
public class ProviderService {

    @RequestMapping("hello")
    public String hello(){
        System.out.println("服务被调用");
        return "hello";
    }
}
