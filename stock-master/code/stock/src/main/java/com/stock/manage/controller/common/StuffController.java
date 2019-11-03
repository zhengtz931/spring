package com.stock.manage.controller.common;

import com.stock.manage.entity.Category;
import com.stock.manage.repository.StuffCategoryRepository;
import com.stock.manage.service.StuffService;
import com.stock.manage.util.ResultVoUtil;
import com.stock.manage.vo.ResultVo;
import com.stock.manage.vo.StuffWithCategoryName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/1 8:53
 */

@RestController
@RequestMapping(value = "/stuff")
public class StuffController {
    @Autowired
    StuffCategoryRepository stuffCategoryRepository;
    @Autowired
    StuffService stuffService;


    @RequestMapping(value="/category/list")
    public ResultVo categoryList(){
        List<Category> all = stuffCategoryRepository.findAll();
        return ResultVoUtil.success(all,all.size());
    }

    @RequestMapping(value="/category/add")
    public ResultVo categoryAdd(Category category) {
        if (category != null){
            //检查有没有同名的分类
            String name = category.getName();
            Category c = stuffCategoryRepository.findByName(name);
            //有同名分类
            if(c!=null)
                category.setId(c.getId());
            stuffCategoryRepository.save(category);
        }
        else
            return ResultVoUtil.error(1,"没有正确接收到数据！");
        return ResultVoUtil.success();
    }

    @RequestMapping(value="/category/update")
    public ResultVo categoryUpdate(Category category) {
        if (category != null){
            stuffCategoryRepository.save(category);
        }
        else
            return ResultVoUtil.error(1,"没有正确接收到数据！");
        return ResultVoUtil.success();
    }

    @RequestMapping(value="/category/del")
    public ResultVo categoryUpdate(String id){
        stuffCategoryRepository.deleteById(Integer.valueOf(id));
        return ResultVoUtil.success();
    }


    @RequestMapping(value="/list")
    public ResultVo stuffList(){
        List<StuffWithCategoryName> all = stuffService.findAll();
        return ResultVoUtil.success(all,all.size());
    }

    @RequestMapping(value="/add")
    public ResultVo stuffAdd(StuffWithCategoryName stuff) {
        if(stuff==null||stuff.getName()==null) return ResultVoUtil.error(1,"添加货物：没有正确接收到参数！");
        return stuffService.add(stuff);
    }

    @RequestMapping(value="/update")
    public ResultVo stuffUpdate(StuffWithCategoryName stuffWithCategoryName) {
        if(stuffWithCategoryName==null||stuffWithCategoryName.getId()==null) return ResultVoUtil.error(1,"更新货物：没有正确接收到参数！");
        return stuffService.update(stuffWithCategoryName);
    }

    @RequestMapping(value="/del")
    public ResultVo stuffUpdate(String id){
        return stuffService.delById(Integer.valueOf(id));
    }


}
