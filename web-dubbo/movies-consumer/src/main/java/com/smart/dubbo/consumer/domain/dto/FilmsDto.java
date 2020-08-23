package com.smart.dubbo.consumer.domain.dto;

import lombok.Data;



@Data
public class FilmsDto extends BaseDto {
    private Integer id;
    private String filmName;
    private String filmDate;

}
