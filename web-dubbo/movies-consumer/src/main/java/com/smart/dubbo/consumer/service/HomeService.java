package com.smart.dubbo.consumer.service;


import com.smart.dubbo.api.domain.dto.FilmsDto;

public interface HomeService {
     FilmsDto createFilms(com.smart.dubbo.api.domain.dto.FilmsDto filmsDto);
}
