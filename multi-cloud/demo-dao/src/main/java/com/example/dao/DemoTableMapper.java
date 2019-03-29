package com.example.dao;

import com.example.obj.DemoTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@Mapper
public interface DemoTableMapper {

    int insert(DemoTable record);


    int insertSelective(DemoTable record);

    /**
     * 查询
     *
     * @param query
     * @return
     */
    List<DemoTable> list(@Param("query") DemoTable query);
}