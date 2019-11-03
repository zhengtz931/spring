package com.stock.manage.enums;

import lombok.Getter;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 22:13
 */
@Getter
public enum StuffEnableEnum {
    NORMAL(1,"启用"),
    CLOSED(0,"不启用"),
    ;

    private Integer code;
    private String enable;

    StuffEnableEnum(Integer code, String enable) {
        this.code = code;
        this.enable = enable;
    }

}
