package com.stock.manage.enums;

import lombok.Getter;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 22:04
 */
@Getter
public enum OrderStatusEnum {
    NOT_CONFIRM(0,"未确认的订单"),
    RESTAURANT_CANCEL(1,"餐厅取消的订单"),
    DELIVERY_CANCEL(2,"中厨取消的订单"),
    CONFIRM(3,"确认的订单"),
    ;

    private Integer code;
    private String status;

    OrderStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }}
