package com.googosoft.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan(basePackages = "com.googosoft.dao")
public class DBConfig {

	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean(initMethod = "init", destroyMethod = "close", name = "dataSource")
	public DruidDataSource dataSource() {
		return new DruidDataSource();
	}
}
