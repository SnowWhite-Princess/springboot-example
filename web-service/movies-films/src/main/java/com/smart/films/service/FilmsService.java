package com.smart.films.service;

import com.smart.films.domain.dto.FilmsDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface FilmsService {
    FilmsDto createFilms(@RequestBody FilmsDto filmsDto);
}
