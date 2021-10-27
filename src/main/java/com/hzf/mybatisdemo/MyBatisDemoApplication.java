package com.hzf.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan({"com.hzf.mybatisdemo.mapper","com.gitee.sunchenbin.mybatis.actable.dao.*"})
@SpringBootApplication
public class MyBatisDemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisDemoApplication.class, args);
	}




}
