package com.smart.base.service;

import com.smart.base.domain.dto.FilmsDto;
import com.smart.base.domain.entity.Image;
import com.smart.base.domain.entity.Navi;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BaseService {
    Image createImage(@RequestBody Image image);

    FilmsDto createFilms(@RequestBody FilmsDto filmsDto);

    List<Navi> getNavi();
}
