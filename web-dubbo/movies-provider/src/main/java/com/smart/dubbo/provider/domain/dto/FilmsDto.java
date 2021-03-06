package com.smart.dubbo.provider.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FilmsDto extends BaseDto {
    private Integer id;
    private String filmName;
    private Date filmDate;

}
