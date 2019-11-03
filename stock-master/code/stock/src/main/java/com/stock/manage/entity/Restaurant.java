package com.stock.manage.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 20:07
 */

/**
 * 	序号	id
 * 	餐厅名称  name
 * 	店长姓名，联系方式放到账号那张表中。
 * 	状态 code 	‘1’:正常，‘0’:闭店或者其他
 */

@Data
@Entity(name="c_restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="code")
    private Integer status;
}
