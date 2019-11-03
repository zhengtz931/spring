package com.stock.manage.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/10/31 20:22
 */

/**
 * 	序号	id
 * 	订单编号	order_id
 * 	备注	remarks
 * 	时间	remark_date
 * 	状态	code		‘1’：中厨发给商家，‘0’商家发给中厨
 */

@Data
@Entity(name="c_order_remarks")
public class OrderRemarks {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="order_id")
    private String order_id;

    @Column(name="remarks")
    private String remarks;

    @Column(name="remark_date")
    private Date remark_date;

    @Column(name="code")
    private Integer status;
}
