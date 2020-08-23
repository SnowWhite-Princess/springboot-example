package com.smart.dubbo.provider.service.impl;

import com.smart.dubbo.api.domain.dto.FilmsDto;
import com.smart.dubbo.api.service.ProviderService;
import com.smart.dubbo.provider.domain.entity.Films;
import com.smart.dubbo.provider.mapper.FilmsMapper;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Resource
    FilmsMapper filmsMapper;

    @Override
    public FilmsDto createFilms(FilmsDto filmsDto) {
        Films films = new Films();
        BeanUtils.copyProperties(filmsDto, films);
        filmsMapper.insert(films);
        return filmsDto;
    }
}
