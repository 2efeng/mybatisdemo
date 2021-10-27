package com.hzf.mybatisdemo.service;

import com.hzf.mybatisdemo.entity.Sys_Role;
import com.hzf.mybatisdemo.mapper.Sys_RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private Sys_RoleMapper roleMapper;

    public Sys_Role Sel(int id){
        return roleMapper.Sel(id);
    }

    public Sys_Role SelByCode(String code){
        return roleMapper.SelByCode(code);
    }

    public int  add(Sys_Role role) {
        return roleMapper.add(role);
    }
}

