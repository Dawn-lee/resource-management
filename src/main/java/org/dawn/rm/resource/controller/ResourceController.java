package org.dawn.rm.resource.controller;

import org.dawn.rm.resource.service.ResourceService;
import org.dawn.rm.resource.vo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping(value = "getResource")
    public File[] getResource(){
        List<Resource> resourceList = new ArrayList<>();
        // TODO 获取资源
        //获取所有盘符
        File[] files = File.listRoots();
        //懒加载机制获取层级
        for(File file:files){
            Resource resource = new Resource();
            resource.setName(file.getName());
            resource.setType("磁盘");
            resource.setIcon("test");
            resourceList.add(resource);
        }
        return files;
    }

    public static void main(String[] args) {
        File[] files = File.listRoots();
        for(File file:files){
            File[] f= file.listFiles();
            System.out.println(f);
        }
    }
}
