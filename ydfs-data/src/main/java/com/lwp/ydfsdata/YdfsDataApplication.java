package com.lwp.ydfsdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lwp.ydfsdata.dao")
public class YdfsDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(YdfsDataApplication.class, args);
	}

}
