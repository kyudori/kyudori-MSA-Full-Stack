package com.example.springsecurityedu2.repository;

import com.example.springsecurityedu2.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MyUserRepository extends JpaRepository<MyUser, Long>{
	MyUser findByUsername(String username);
}
