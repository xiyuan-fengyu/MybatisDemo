package com.xiyuan.mybatis.dao;

import com.xiyuan.mybatis.model.TbTest;

import java.util.List;

/**
 * Created by xiyuan_fengyu on 2016/8/11.
 */
public interface TbTestDao extends TbTestMapper {

    List<TbTest> page(int pageNum, int pageSize);

    List<TbTest> idBetween(int start, int end);

    int maxId();

}
