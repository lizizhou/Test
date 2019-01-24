package com.xzy.springmvc_mybatis.service;

import com.xzy.springmvc_mybatis.pojo.Items;

import java.util.List;

public interface ItemsService {
    public List<Items> selectAll(Items items);
}
