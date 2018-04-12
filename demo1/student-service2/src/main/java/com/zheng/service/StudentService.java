package com.zheng.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zheng.ServiceMapper;

/**
 * Created by lenovo on 2018/3/27.
 */
@Service
public class StudentService implements ServiceMapper {
    public String name(){
        return "2";
    }

}
