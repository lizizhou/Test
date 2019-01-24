package com.xzy.springmvc_mybatis.controller;

import com.xzy.springmvc_mybatis.pojo.Items;
import com.xzy.springmvc_mybatis.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther zhouli
 * e-mail  ggwmmd@163.com
 * @since 2018/12/17 21:13
 */
@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping(value="/list.form")
    public ModelAndView itemList(){
       List<Items> list =itemsService.selectAll(null);
       ModelAndView mo = new ModelAndView();
       mo.addObject("itemList",list);
       mo.setViewName("itemList");
       return mo;
    }
}
