package com.hzf.mybatisdemo.mapper;

import com.hzf.mybatisdemo.entity.Sys_User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface  Sys_UserMapper {

    Sys_User Sel(@Param("id") int id);

    Sys_User GetLast();

    int add(Sys_User user);

}
