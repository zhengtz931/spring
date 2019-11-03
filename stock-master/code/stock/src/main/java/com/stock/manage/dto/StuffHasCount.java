package com.stock.manage.dto;

import com.stock.manage.entity.Stuff;
import lombok.Data;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 20:14
 */

@Data
public class StuffHasCount extends Stuff {

    //订单中该商品的数量
    private Integer count = 0;

}
