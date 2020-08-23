package com.smart.films.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "tb_films")
public class Films {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 电影名称
     */
    @TableField(value = "film_name")
    private String filmName;

    /**
     * 电影日期
     */
    @TableField(value = "film_date")
    private Date filmDate;

    public static final String COL_ID = "id";

    public static final String COL_FILM_NAME = "film_name";

    public static final String COL_FILM_DATE = "film_date";
}