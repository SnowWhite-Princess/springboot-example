package com.smart.dubbo.consumer.domain.entity;


import lombok.Data;

import java.util.Date;

@Data

public class Films {
    /**
     * 主键
     */

    private Integer id;

    /**
     * 电影名称
     */

    private String filmName;

    /**
     * 电影日期
     */

    private Date filmDate;


}