package com.smart.dubbo.api.service;

import com.smart.dubbo.api.domain.dto.FilmsDto;
import org.springframework.web.bind.annotation.RequestBody;


public interface ProviderService {
    FilmsDto createFilms(@RequestBody FilmsDto filmsDto);
}
