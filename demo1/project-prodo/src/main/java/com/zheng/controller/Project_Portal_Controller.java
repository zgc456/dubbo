package com.zheng.controller;

import com.zheng.ServiceMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/3/27.
 */
@RestController
public class Project_Portal_Controller {
  @com.alibaba.dubbo.config.annotation.Reference
    ServiceMapper serviceMapper;
  @GetMapping("/a")
    public String names(){
      return serviceMapper.name();
  }
}
