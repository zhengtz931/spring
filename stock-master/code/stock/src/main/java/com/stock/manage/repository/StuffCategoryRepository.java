package com.stock.manage.repository;

import com.stock.manage.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/1 9:43
 */

public interface StuffCategoryRepository extends JpaRepository<Category,Integer> {
    void deleteById(Integer id);
    Category findByName(String name);
}
