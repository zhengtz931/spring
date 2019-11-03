package com.stock.manage.enums;

import lombok.Getter;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 21:54
 */
@Getter
public enum  AccountPermissionEnum{
    FINANCE(1, "财务"),
    RESTAURANT(0, "餐厅"),
    DELIVERY(-1, "中厨"),
    ;

    private Integer code;
    private String permission;

    AccountPermissionEnum(Integer code, String permission) {
        this.code = code;
        this.permission = permission;
    }

}
