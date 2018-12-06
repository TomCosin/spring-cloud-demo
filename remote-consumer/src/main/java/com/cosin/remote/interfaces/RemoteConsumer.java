package com.cosin.remote.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVICER")
public interface RemoteConsumer {

    @GetMapping("/api/hello")
    String demo();
}
