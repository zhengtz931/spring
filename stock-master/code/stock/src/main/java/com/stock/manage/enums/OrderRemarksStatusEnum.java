package com.stock.manage.enums;

import lombok.Getter;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 22:08
 */
@Getter
public enum OrderRemarksStatusEnum {
    DELIVERY2RESTAURANT(1,"中厨发送给餐厅的备注"),
    RESTAURANT2DELIVERY(0,"餐厅发送给中厨的备注"),
    ;

    private Integer code;
    private String message;

    OrderRemarksStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
