package com.cosin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yx
 */
@SpringBootApplication
@EnableEurekaServer
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }
}
