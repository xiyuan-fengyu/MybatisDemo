package com.xiyuan.mybatis.dao;

import com.xiyuan.mybatis.model.TbTest;

public interface TbTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Tue Oct 18 18:17:14 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Tue Oct 18 18:17:14 CST 2016
     */
    int insert(TbTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Tue Oct 18 18:17:14 CST 2016
     */
    int insertSelective(TbTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Tue Oct 18 18:17:14 CST 2016
     */
    TbTest selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Tue Oct 18 18:17:14 CST 2016
     */
    int updateByPrimaryKeySelective(TbTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Tue Oct 18 18:17:14 CST 2016
     */
    int updateByPrimaryKey(TbTest record);
}