package com.example.springlab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.zip.DataFormatException;

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
@MapperScan(value={"mybatis.dao"})
public class SpringlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringlabApplication.class, args);
	}

}
