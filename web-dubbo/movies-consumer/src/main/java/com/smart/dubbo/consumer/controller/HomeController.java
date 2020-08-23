package com.smart.dubbo.consumer.controller;


import com.smart.dubbo.api.domain.dto.FilmsDto;
import com.smart.dubbo.consumer.service.HomeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HomeController {
    @Resource
    HomeService homeService;
    @PostMapping("/index")
    public FilmsDto index(@RequestBody FilmsDto filmsDto){
        FilmsDto films = homeService.createFilms(filmsDto);
        return films;
    }
}
