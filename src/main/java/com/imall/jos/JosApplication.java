package com.imall.jos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.imall.jos.bean.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class JosApplication {

	public static void main(String[] args) {
		SpringApplication.run(JosApplication.class, args);
	}
}
