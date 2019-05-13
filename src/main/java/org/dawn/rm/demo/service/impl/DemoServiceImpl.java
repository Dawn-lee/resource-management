package org.dawn.rm.demo.service.impl;

import org.dawn.rm.db.mapper.DemoMapper;
import org.dawn.rm.db.model.Demo;
import org.dawn.rm.demo.service.DemoService;
import org.dawn.rm.demo.vo.DemoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<DemoVO> getList() {
        List<Demo> demoList = demoMapper.getList();
        List<DemoVO> demoVOList = new ArrayList<>();
        demoList.stream().forEach(demo -> {
            DemoVO demoVO = new DemoVO();
            BeanUtils.copyProperties(demo, demoVO);
            demoVOList.add(demoVO);
        });
        return demoVOList;
    }
}
