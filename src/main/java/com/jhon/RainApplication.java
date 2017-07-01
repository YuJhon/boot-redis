package com.jhon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot 的启动类
 */
@SpringBootApplication
@MapperScan("com.jhon.dao")
public class RainApplication {

	public static void main(String[] args) {
		SpringApplication.run(RainApplication.class, args);
	}
}
