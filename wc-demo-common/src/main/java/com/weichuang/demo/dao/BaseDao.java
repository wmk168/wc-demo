package com.weichuang.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 基础Dao，操作数据库
 * @author wmk
 *
 */
public interface BaseDao<T> extends Mapper<T>,MySqlMapper<T> {

    //自定义动态sql脚本
    @Select("${sql}")
    List<T> selectBySql(@Param("sql") String sql);

    @Select("${sql}")
    Integer countBySql(@Param("sql") String countSql);
    
    
}
