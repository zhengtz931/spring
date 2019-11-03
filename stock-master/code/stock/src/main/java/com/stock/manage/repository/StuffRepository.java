package com.stock.manage.repository;

import com.stock.manage.entity.Stuff;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/3 8:30
 */

public interface StuffRepository extends JpaRepository<Stuff,Integer> {
    void deleteById(Integer id);
    Stuff findByName(String name);
}
