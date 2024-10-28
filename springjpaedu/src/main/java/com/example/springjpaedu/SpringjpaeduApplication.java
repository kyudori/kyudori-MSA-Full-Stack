package com.example.springjpaedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.example.springjpaedu.repository"})
@EntityScan(basePackages = {"com.example.springjpaedu.entity"})
@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
public class SpringjpaeduApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaeduApplication.class, args);
	}

}
