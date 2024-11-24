package com.example.spingvueedu2.repository;

import com.example.spingvueedu2.entity.JwtMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<JwtMember, Integer> {
    JwtMember findByEmailAndPassword(String email, String password);
}