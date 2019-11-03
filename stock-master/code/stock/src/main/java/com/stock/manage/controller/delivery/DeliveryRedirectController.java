package com.stock.manage.controller.delivery;

import com.stock.manage.entity.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: ZhaoGuorui
 * @date: 2019/11/1 8:28
 */

@Controller
@RequestMapping(value="/delivery")
public class DeliveryRedirectController {

    @RequestMapping(value = "/index.html")
    public String indexPage(){
        return "delivery/index";
    }

    @RequestMapping(value = "/list.html")
    public String listPage(){
        return "delivery/stuff/list";
    }

    @RequestMapping(value = "/categoryList.html")
    public String categoryListPage(){
        return "delivery/stuff/categoryList";
    }

    @RequestMapping(value = "/categoryAdd.html")
    public String categoryAddPage(){
        return "delivery/stuff/categoryAdd";
    }

    @RequestMapping(value = "/categoryEdit.html")
    public ModelAndView categoryEditPage(Category category){
        ModelAndView mav = new ModelAndView();
        mav.addObject("category",category);
        mav.setViewName("delivery/stuff/categoryEdit");
        return mav;
    }


}
