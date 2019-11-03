package com.stock.manage.enums;

import lombok.Getter;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 21:58
 */
@Getter
public enum AccountEnableEnum{
    ENABLE(1,"启用"),
    NOT_ENABLE(0,"不启用"),
    ;
    private Integer code;
    private String enable;

    AccountEnableEnum(Integer code, String enable) {
        this.code = code;
        this.enable = enable;
    }

}
