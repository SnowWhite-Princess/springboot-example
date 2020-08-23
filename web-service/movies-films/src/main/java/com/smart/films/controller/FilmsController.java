package com.smart.films.controller;

import com.smart.films.domain.dto.FilmsDto;
import com.smart.films.service.FilmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/films")
@Slf4j
public class FilmsController {
    @Resource
    FilmsService filmsService;

    @PostMapping("/save")
    public FilmsDto createFilms(@RequestBody FilmsDto filmsDto) {
        log.info(filmsDto.toString());
        filmsService.createFilms(filmsDto);
        return filmsDto;
    }
}
