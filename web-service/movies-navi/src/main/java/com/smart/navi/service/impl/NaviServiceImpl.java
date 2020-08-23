package com.smart.navi.service.impl;

import com.smart.navi.domain.entity.Navi;
import com.smart.navi.mapper.NaviMapper;
import com.smart.navi.service.NaviService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NaviServiceImpl implements NaviService {
    @Resource
    NaviMapper naviMapper;


    @Override
    public List<Navi> selectAll() {
        List<Navi> list = naviMapper.selectAll();
        return list;
    }
}
