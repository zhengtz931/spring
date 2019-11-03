package com.stock.manage.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 20:00
 */

/**
 * 	序号	id
 * 	类别	category
 * 	会计科目 account_subject
 * 	名称	name
 * 	规格	specification
 * 	单位	unit
 * 	单位说明	description
 * 	配送价	delivery_price
 * 	进货价	purchase_price
 * 	是否启用	enable 	‘1：启用；0：不启用；默认启用’
 */
@Data
@Entity(name="c_stuff")
public class Stuff {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="category")
    private Integer category;

    @Column(name="account_subject")
    private String account_subject;

    @Column(name="name")
    private String name;

    @Column(name="specification")
    private String specification;

    @Column(name="unit")
    private String unit;

    @Column(name="description")
    private String description;

    @Column(name="delivery_price")
    private Double delivery_price;

    @Column(name="purchase_price")
    private Double purchase_price;

    @Column(name="enable")
    private Integer enable;
}
