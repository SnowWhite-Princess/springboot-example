package com.smart.base.service;

import com.smart.base.domain.dto.FilmsDto;
import com.smart.base.domain.entity.Image;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "cloud-feign-films-server-hmy",path = "/api/films")
public interface FilmsService {
    @PostMapping("/save")
    public FilmsDto createFilms(@RequestBody FilmsDto filmsDto);

}
