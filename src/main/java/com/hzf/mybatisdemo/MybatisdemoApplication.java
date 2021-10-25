package com.hzf.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


@MapperScan({"com.hzf.mybatisdemo.mapper","com.gitee.sunchenbin.mybatis.actable.dao.*"})
@SpringBootApplication
public class MybatisdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisdemoApplication.class, args);
	}



}
