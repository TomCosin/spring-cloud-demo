package com.cosin.remote.controller;

import com.cosin.remote.interfaces.RemoteConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RemoteConsumer remoteConsumer;

    @GetMapping("hello")
    public String getDemo(){
        return remoteConsumer.demo();
    }
}
