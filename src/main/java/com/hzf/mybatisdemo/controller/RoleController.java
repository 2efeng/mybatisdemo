package com.hzf.mybatisdemo.controller;

import com.hzf.mybatisdemo.entity.Sys_Role;
import com.hzf.mybatisdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/Role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("getRole/{id}")
    public String GetUser(@PathVariable int id){
        return roleService.Sel(id).toString();
    }

    @RequestMapping("getRoleByCode/{code}")
    public String GetUserByCode(@PathVariable String code){
        return roleService.SelByCode(code).toString();
    }

    @RequestMapping("addRole")
    public Sys_Role AddUser(){
        Date dtNow = new Date();
        Sys_Role data = new Sys_Role("管理员","admin",dtNow,dtNow);
        int currId = roleService.add(data);
        return data;
    }
}
