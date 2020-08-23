package com.smart.base.controller;

import com.smart.base.domain.dto.FilmsDto;
import com.smart.base.domain.entity.Image;
import com.smart.base.domain.entity.Navi;
import com.smart.base.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/base")
@Slf4j
public class BaseController {
    @Resource
    BaseService baseService;

    @PostMapping("/createImage")
    public Image createImage(@RequestBody Image image){
        log.info(image.toString());
        return baseService.createImage(image);
    }

    @PostMapping("/createFilms")
    public FilmsDto createFilms(@RequestBody FilmsDto filmsDto){
        log.info(filmsDto.toString());
        return baseService.createFilms(filmsDto);
    }

    @GetMapping("/list")
    public List<Navi> getList(){
        return baseService.getNavi();
    }


}
