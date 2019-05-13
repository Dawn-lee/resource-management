package org.dawn.rm.demo.controller;

import org.dawn.rm.demo.service.DemoService;
import org.dawn.rm.demo.vo.DemoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/get")
    public List<DemoVO> getList(){
        return demoService.getList();
    }
}
