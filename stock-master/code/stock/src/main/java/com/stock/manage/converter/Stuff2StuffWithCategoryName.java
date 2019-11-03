package com.stock.manage.converter;

import com.stock.manage.entity.Stuff;
import com.stock.manage.vo.StuffWithCategoryName;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/3 10:14
 */

public class Stuff2StuffWithCategoryName{
    public static StuffWithCategoryName Stuff2StuffWithCategoryName(Stuff stuff,String name){
        if(stuff==null) return null;

        StuffWithCategoryName stuffWithCategoryName = new StuffWithCategoryName();

        stuffWithCategoryName.setId(stuff.getId());
        stuffWithCategoryName.setCategory(stuff.getCategory());
        stuffWithCategoryName.setAccount_subject(stuff.getAccount_subject());
        stuffWithCategoryName.setDelivery_price(stuff.getDelivery_price());
        stuffWithCategoryName.setPurchase_price(stuff.getPurchase_price());
        stuffWithCategoryName.setUnit(stuff.getUnit());
        stuffWithCategoryName.setSpecification(stuff.getSpecification());
        stuffWithCategoryName.setEnable(stuff.getEnable());
        stuffWithCategoryName.setDescription(stuff.getDescription());
        stuffWithCategoryName.setName(stuff.getName());

        stuffWithCategoryName.setCategoryName(name);

        return stuffWithCategoryName;
    }

    public static Stuff StuffWithCategoryName2Stuff(StuffWithCategoryName stuffWithCategoryName,Integer categoryId){
        if(stuffWithCategoryName==null) return null;

        Stuff stuff = new Stuff();

        stuff.setId(stuffWithCategoryName.getId());
        stuff.setAccount_subject(stuffWithCategoryName.getAccount_subject());
        stuff.setDelivery_price(stuffWithCategoryName.getDelivery_price());
        stuff.setPurchase_price(stuffWithCategoryName.getPurchase_price());
        stuff.setUnit(stuffWithCategoryName.getUnit());
        stuff.setSpecification(stuffWithCategoryName.getSpecification());
        stuff.setEnable(stuffWithCategoryName.getEnable());
        stuff.setDescription(stuffWithCategoryName.getDescription());
        stuff.setName(stuffWithCategoryName.getName());

        stuff.setCategory(categoryId);

        return stuff;
    }
}
