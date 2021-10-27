package com.hzf.mybatisdemo.mapper;

import com.hzf.mybatisdemo.entity.Sys_Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Sys_RoleMapper {

    Sys_Role Sel(int id);

    Sys_Role SelByCode(String code);

    int add(Sys_Role role);

}
