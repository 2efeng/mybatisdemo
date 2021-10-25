package com.hzf.mybatisdemo.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@Table(name = "Sys_User")
public class Sys_User  extends BaseModel {

    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private int id;

    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 256)
    private String name;

    @Column(name = "password",type = MySqlTypeConstant.VARCHAR,length = 256)
    private  String password;

    @Column(name = "phone",type = MySqlTypeConstant.VARCHAR,length = 111)
    private  String phone;

    @Column(name = "broth",type = MySqlTypeConstant.DATETIME)
    private Date broth;

    @Column(name = "create_time",type = MySqlTypeConstant.DATETIME)
    private Date create_time;

    @Column(name = "update_time",type = MySqlTypeConstant.DATETIME)
    private Date update_time;

}
