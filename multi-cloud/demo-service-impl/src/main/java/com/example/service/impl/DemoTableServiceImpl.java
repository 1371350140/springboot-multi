package com.example.service.impl;

import com.example.dao.DemoTableMapper;
import com.example.obj.DemoTable;
import com.example.service.DemoTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Authhor zhangren
 * dataTime 2019-03-22 3:50 PM
 */
@Service
public class DemoTableServiceImpl implements DemoTableService {

    @Autowired
    DemoTableMapper demoTableMapper;

    @Override
    public int insert(DemoTable record) {
        return demoTableMapper.insert(record);
    }

    @Override
    public int insertSelective(DemoTable record) {
        return demoTableMapper.insertSelective(record);
    }

    @Override
    public List<DemoTable> list(DemoTable query) {
        return demoTableMapper.list(query);
    }
}
