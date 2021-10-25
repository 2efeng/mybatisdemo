package com.hzf.mybatisdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*"})
public class DbSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return  new DruidDataSource();
    }


}
