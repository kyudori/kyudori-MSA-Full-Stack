package com.example.springjpaedu.repository;

import com.example.springjpaedu.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
