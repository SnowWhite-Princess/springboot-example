package com.smart.navi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smart.navi.domain.entity.Navi;

import java.util.List;

public interface NaviMapper extends BaseMapper<Navi> {
    List<Navi> selectAll();
}