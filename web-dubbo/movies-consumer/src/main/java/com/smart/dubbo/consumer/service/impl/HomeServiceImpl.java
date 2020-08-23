package com.smart.dubbo.consumer.service.impl;

import com.smart.dubbo.api.domain.dto.FilmsDto;
import com.smart.dubbo.api.service.ProviderService;

import com.smart.dubbo.consumer.service.HomeService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

//在提供者 使用 Service 注册
//在消费者 使用 Reference 注册
//rest 消费者是调用提供者的控制层
//rpc  消费者是调用提供者的service层

@Service
public class HomeServiceImpl implements HomeService {
    @Reference
    ProviderService providerService;

    @Override
    public FilmsDto createFilms(FilmsDto filmsDto) {
        FilmsDto films = providerService.createFilms(filmsDto);
        return films;
    }
}
