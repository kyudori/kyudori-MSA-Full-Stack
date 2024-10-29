package com.example.springnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.example.springnews.repository"})
@EntityScan(basePackages = {"com.example.springnews.model"})
@SpringBootApplication
public class SpringnewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringnewsApplication.class, args);
	}

}
