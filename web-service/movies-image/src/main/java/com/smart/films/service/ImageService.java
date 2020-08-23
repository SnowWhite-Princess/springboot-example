package com.smart.films.service;

import com.smart.films.domain.entity.Image;
import org.springframework.web.bind.annotation.RequestBody;

public interface ImageService {
    Image createImage(@RequestBody Image image);
}
