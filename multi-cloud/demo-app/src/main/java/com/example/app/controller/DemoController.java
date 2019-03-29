package com.example.app.controller;

import com.example.obj.DemoTable;
import com.example.service.DemoTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Authhor zhangren
 * dataTime 2019-03-08 5:52 PM
 */
@RestController
@RequestMapping("hello")
public class DemoController {

    @Autowired
    DemoTableService demoTableService;

    @RequestMapping("world")
    public String helloWorld(String name) {
        return "Hello " + name;
    }

    @RequestMapping("obj")
    public String helloObj(@RequestBody DemoTable query) {
        return "Hello " + query.getName();
    }

    @RequestMapping("list")
    public List<DemoTable> list(@RequestBody(required = false) DemoTable query) {
        return demoTableService.list(query);
    }

    @RequestMapping("insert")
    public String dao(@RequestBody DemoTable dto) {
        return String.valueOf(demoTableService.insert(dto));
    }

}