package com.hzf.mybatisdemo.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

@Data
@Table(name = "Sys_User_Role")
public class Sys_User_Role {

    @Column(name = "userId",type = MySqlTypeConstant.INT,length = 11)
    private int userId;

    @Column(name = "roleId",type = MySqlTypeConstant.INT,length = 11)
    private int roleId;

}
