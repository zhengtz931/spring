package com.stock.manage.service.impl;

import com.stock.manage.converter.Stuff2StuffWithCategoryName;
import com.stock.manage.entity.Category;
import com.stock.manage.entity.Stuff;
import com.stock.manage.repository.StuffCategoryRepository;
import com.stock.manage.repository.StuffRepository;
import com.stock.manage.service.StuffService;
import com.stock.manage.util.ResultVoUtil;
import com.stock.manage.vo.ResultVo;
import com.stock.manage.vo.StuffWithCategoryName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/3 8:39
 */

@Service
public class StuffServiceImpl implements StuffService {
    @Autowired
    StuffRepository stuffRepository;

    @Autowired
    StuffCategoryRepository stuffCategoryRepository;


    @Override
    public List<StuffWithCategoryName> findAll() {
        //1.权限判断，目前没做，用户管理还没做好
        //先处理中厨（财务）的
        List<Stuff> stuffs = stuffRepository.findAll();
        List<StuffWithCategoryName> stuffWithCategoryNames = new ArrayList<>();

        //2.将Stuff中的category从integer换成相应的String名字

        List<Category> categories = stuffCategoryRepository.findAll();
        //2.1将category相应字段放入hashmap
        HashMap<Integer,String> map = new HashMap<>();
        for (Category category: categories) {
            map.put(category.getId(),category.getName());
        }
        //2.2赋值StuffWithStringCategory
        for (Stuff stuff: stuffs) {
            StuffWithCategoryName stuffWithCategoryName = new StuffWithCategoryName();
            stuffWithCategoryName = Stuff2StuffWithCategoryName.
                    Stuff2StuffWithCategoryName(stuff,getCategoryName(stuff.getCategory()));

            if(stuffWithCategoryName!=null)
                stuffWithCategoryNames.add(stuffWithCategoryName);
        }

        return stuffWithCategoryNames;
    }

    @Override
    public ResultVo add(StuffWithCategoryName stuffWithCategoryName) {

        if(stuffWithCategoryName==null){
            return ResultVoUtil.error(1,"没有正确接收到参数！");
        }else{
            //检察有没有同名的货物
            String name = stuffWithCategoryName.getName();
            Stuff temp = stuffRepository.findByName(name);
            //有同名货物
            if(temp != null)
                return ResultVoUtil.error(1,"该货物已经存在，请直接编辑！");
            //没同名货物，StuffWithCategoryName to Stuff
            Stuff stuff = Stuff2StuffWithCategoryName.
                    StuffWithCategoryName2Stuff(stuffWithCategoryName,getCategoryId(stuffWithCategoryName.getName()));
            if(stuff==null)
                return ResultVoUtil.error(1,"添加失败！");
            stuffRepository.save(stuff);
            return ResultVoUtil.success();
        }
    }

    @Override
    public ResultVo update(StuffWithCategoryName stuffWithCategoryName) {
        if(stuffWithCategoryName==null){
            return ResultVoUtil.error(1,"没有正确接收到参数！");
        }else{
            Stuff stuff = Stuff2StuffWithCategoryName.
                    StuffWithCategoryName2Stuff(stuffWithCategoryName,getCategoryId(stuffWithCategoryName.getName()));
            if(stuff==null)
                return ResultVoUtil.error(1,"添加失败！");
            stuffRepository.save(stuff);
            return ResultVoUtil.success();
        }
    }

    @Override
    public ResultVo delById(Integer id) {
        if(id==null||id<0) return ResultVoUtil.error(1,"传入数据错，删除失败！");

        stuffRepository.deleteById(id);
        return ResultVoUtil.success();
    }


    /**
     * 获取分类id
     *
     * @param name
     * @return
     */
    public Integer getCategoryId(String name){
        List<Category> categories = stuffCategoryRepository.findAll();
        HashMap<Integer, String> map = new HashMap<>();
        for(Category category:categories){
            if(name==category.getName())
                return category.getId();
        }
        return null;
    }

    /**
     * 获取分类名称
     *
     * @param id
     * @return
     */
    public String getCategoryName(Integer id){
        List<Category> categories = stuffCategoryRepository.findAll();
        HashMap<Integer, String> map = new HashMap<>();
        for(Category category:categories){
            if(id == category.getId())
                return category.getName();
        }
        return null;
    }

}
