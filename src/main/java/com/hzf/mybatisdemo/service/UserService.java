package com.hzf.mybatisdemo.service;

import com.hzf.mybatisdemo.entity.Sys_User;
import com.hzf.mybatisdemo.mapper.Sys_UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private  Sys_UserMapper userMapper;

    public Sys_User Sel(int id){
        return userMapper.Sel(id);
    }
}

