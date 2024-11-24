package com.example.spingvueedu1.repository;

import com.example.spingvueedu1.entity.JwtMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JwtMemberRepository extends JpaRepository<JwtMember, Integer> {
    JwtMember findByEmailAndPassword(String email, String password);
}