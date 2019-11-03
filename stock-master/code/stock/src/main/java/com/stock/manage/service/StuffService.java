package com.stock.manage.service;

import com.stock.manage.entity.Stuff;
import com.stock.manage.vo.ResultVo;
import com.stock.manage.vo.StuffWithCategoryName;

import java.util.List;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/3 8:35
 */

public interface StuffService {
    List<StuffWithCategoryName> findAll();
    ResultVo add(StuffWithCategoryName stuff);
    ResultVo update(StuffWithCategoryName stuffWithCategoryName);
    ResultVo delById(Integer id);
}
