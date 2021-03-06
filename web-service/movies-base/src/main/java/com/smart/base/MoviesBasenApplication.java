package com.smart.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
// 注册所有的 feign
@EnableFeignClients
public class MoviesBasenApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoviesBasenApplication.class, args);
    }
}
