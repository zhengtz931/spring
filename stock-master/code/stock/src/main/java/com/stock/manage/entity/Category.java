package com.stock.manage.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 20:05
 */

/**
 * 	序号	id
 * 	类名	name
 * 	描述 remarks
 */

@Data
@Entity(name="c_category")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="remarks")
    private String remarks;
}
