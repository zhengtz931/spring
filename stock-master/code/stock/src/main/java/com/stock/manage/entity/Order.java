package com.stock.manage.entity;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 20:09
 */

import com.stock.manage.dto.StuffHasCount;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 	序号	id
 * 	订单编号	order_id
 * 	门店名称	name
 * 	生成订单日期	generate_date
 * 	确认订单日期	confirm_date
 * 	订单总金额	total_price
 * 	是否产生售后	after_sale
 * 	退回金额	return_price
 * 	订单详情	stuffs
 * 	订单状态	order_status		‘0’：未接的订单，‘1’：餐厅取消的订单，‘2’：中厨取消的订单, ‘3’：确认的订单
 */

@Data
@Entity(name="c_order")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="order_id")
    private String order_id;

    @Column(name="name")
    private String name;

    @Column(name="generate_date")
    private Date generate_date;

    @Column(name="confirm_date")
    private Date confirm_date;

    @Column(name="total_price")
    private String total_price;

    @Column(name="after_sale")
    private String after_sale;

    @Column(name="return_price")
    private String return_price;

    @Column(name="stuffs")
    private String stuffs;

    @Column(name="order_status")
    private String order_status;

}
