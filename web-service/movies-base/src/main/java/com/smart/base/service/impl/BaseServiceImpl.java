package com.smart.base.service.impl;

import com.smart.base.domain.dto.FilmsDto;
import com.smart.base.domain.entity.Image;
import com.smart.base.domain.entity.Navi;
import com.smart.base.service.BaseService;
import com.smart.base.service.FilmsService;
import com.smart.base.service.ImageService;
import com.smart.base.service.NaviService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BaseServiceImpl implements BaseService {
    @Resource
    ImageService orderService;
    @Resource
    FilmsService filmsService;
    @Resource
    NaviService naviService;

    @Override
    public Image createImage(Image image) {
        return orderService.createOrder(image);
    }

    @Override
    public FilmsDto createFilms(FilmsDto filmsDto) {
        return filmsService.createFilms(filmsDto);
    }

    @Override
    public List<Navi> getNavi() {
        return naviService.getNavi();
    }
}
