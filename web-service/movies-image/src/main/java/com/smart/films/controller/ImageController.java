package com.smart.films.controller;

import com.smart.films.domain.entity.Image;
import com.smart.films.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/image")
@Slf4j
public class ImageController {
    @Resource
    ImageService imageService;
    /**
     * 创建订单
     */
    @PostMapping("/save/")
    public Image createOrder(@RequestBody Image image) {
        log.info(image.toString());
        Image image1 = imageService.createImage(image);
        return image1;
    }
}
