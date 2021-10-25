package com.hzf.mybatisdemo.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "Sys_Role")
public class Sys_Role extends BaseModel {

    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private int id;

    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 256)
    private String name;

    @Column(name = "create_time",type = MySqlTypeConstant.DATETIME)
    private Date create_time;

    @Column(name = "update_time",type = MySqlTypeConstant.DATETIME)
    private Date update_time;
}
