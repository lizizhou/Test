package com.xzy.springmvc_mybatis.service;

import com.xzy.springmvc_mybatis.mapper.ItemsMapper;
import com.xzy.springmvc_mybatis.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther zhouli
 * e-mail  ggwmmd@163.com
 * @since 2018/12/17 21:13
 */
@Service
public class ItemsServletImp implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> selectAll(Items items){
       List<Items> list = itemsMapper.selectByExampleWithBLOBs(null);

        return list;
    }

}
