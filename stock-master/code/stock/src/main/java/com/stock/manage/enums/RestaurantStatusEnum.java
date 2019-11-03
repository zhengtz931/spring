package com.stock.manage.enums;

import lombok.Getter;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 22:11
 */

@Getter
public enum RestaurantStatusEnum {
    NORMAL(1,"正常开店"),
    SHUTDOWN(0,"关闭的店"),
    ;

    private Integer code;
    private String status;


    RestaurantStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }}
