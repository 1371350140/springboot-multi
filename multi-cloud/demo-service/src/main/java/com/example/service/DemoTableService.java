package com.example.service;

import com.example.obj.DemoTable;

import java.util.List;

/**
 * @Authhor zhangren
 * dataTime 2019-03-22 3:49 PM
 */
public interface DemoTableService {


    int insert(DemoTable record);


    int insertSelective(DemoTable record);

    /**
     * 查询
     *
     * @param query
     * @return
     */
    List<DemoTable> list(DemoTable query);
}
