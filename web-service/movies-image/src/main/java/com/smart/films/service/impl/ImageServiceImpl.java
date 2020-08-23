package com.smart.films.service.impl;

import com.smart.films.domain.entity.Image;
import com.smart.films.mapper.ImageMapper;
import com.smart.films.service.ImageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class ImageServiceImpl implements ImageService {
    @Resource
    ImageMapper imageMapper;

    @Override
    public Image createImage(Image image) {
        imageMapper.insert(image);
        return image;
    }
}
