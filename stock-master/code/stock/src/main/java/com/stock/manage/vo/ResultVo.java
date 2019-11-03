package com.stock.manage.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/1 8:57
 */

@Data
public class ResultVo<T> implements Serializable {
    private static final long serialVersionUID = 2867662309348307330L;

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** data的数量. */
    private Integer count;

    /** 具体内容. */
    private T data;

    public ResultVo(Integer code, String msg, Integer count, T data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public ResultVo() {
    }
}
