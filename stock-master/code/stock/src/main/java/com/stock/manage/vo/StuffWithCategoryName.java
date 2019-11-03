package com.stock.manage.vo;

import com.stock.manage.entity.Stuff;
import lombok.Data;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/3 8:43
 *
 * 添加一个categoryName字段，以便前端展示。
 */


@Data
public class StuffWithCategoryName extends Stuff {
    private String categoryName;


}
