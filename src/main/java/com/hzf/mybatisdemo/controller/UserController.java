package com.hzf.mybatisdemo.controller;

import com.hzf.mybatisdemo.entity.Sys_User;
import com.hzf.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

    @RequestMapping("addUser")
    public Sys_User AddUser(){
        Sys_User user =  userService.GetLast();
        Date dtNow = new Date();
        String currIdx = String.valueOf(user.getId() + 1);
        Sys_User data = new Sys_User(currIdx,currIdx,currIdx,dtNow,dtNow,dtNow);
        int currId = userService.add(data);
        return data;
    }
}
