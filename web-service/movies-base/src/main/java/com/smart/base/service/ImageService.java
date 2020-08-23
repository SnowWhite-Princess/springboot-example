package com.smart.base.service;

import com.smart.base.domain.entity.Image;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "cloud-feign-image-server-hmy",path = "/api/image")
public interface ImageService {
    @PostMapping("/save/")
    public Image createOrder(@RequestBody Image image) ;

}
