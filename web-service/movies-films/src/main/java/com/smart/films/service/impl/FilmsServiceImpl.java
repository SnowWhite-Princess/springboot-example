package com.smart.films.service.impl;

import com.smart.films.domain.dto.FilmsDto;
import com.smart.films.domain.entity.Films;
import com.smart.films.mapper.FilmsMapper;
import com.smart.films.service.FilmsService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class FilmsServiceImpl implements FilmsService {
    @Resource
    FilmsMapper filmsMapper;
    @Override
    public FilmsDto createFilms(FilmsDto filmsDto) {
        Films films = new Films();
        BeanUtils.copyProperties(filmsDto,films);
        filmsMapper.insert(films);
        return filmsDto;
    }
}
