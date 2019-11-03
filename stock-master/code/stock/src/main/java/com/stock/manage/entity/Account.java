package com.stock.manage.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 19:54
 */

/**
 * 	序号	id
 * 	账号	username
 * 	密码	password
 * 	姓名	name
 * 	联系方式	phone
 * 	餐厅地址	address
 * 	权限	permission	‘1：财务；0：餐厅；-1：中厨；
 * 	是否启用	enable 	‘1：启用；0：不启用；默认启用’
 */
@Data
@Entity(name="c_account")
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="address")
    private String address;

    @Column(name="permission")
    private Integer permission;

    @Column(name="enable")
    private Integer enable;

}
