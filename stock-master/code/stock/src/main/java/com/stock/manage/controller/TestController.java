package com.stock.manage.controller;

import com.stock.manage.entity.Category;
import com.stock.manage.repository.StuffCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/1 9:19
 */

@Controller
public class TestController {

    @Autowired
    StuffCategoryRepository repository;

    @RequestMapping(value = "test")
    public void test(){
        Category category = new Category();
        category.setId(14);
        category.setName("666");
        category.setRemarks("666");

        repository.save(category);
    }
}
