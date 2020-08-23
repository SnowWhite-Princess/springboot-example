package com.smart.base.service;

import com.smart.base.domain.entity.Navi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "cloud-feign-navi-server-hmy",path = "/api/navi")
public interface NaviService {
    @GetMapping("/list")
    public List<Navi> getNavi();
}
