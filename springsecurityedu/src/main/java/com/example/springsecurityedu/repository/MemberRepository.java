package com.example.springsecurityedu.repository;

import com.example.springsecurityedu.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<com.example.springsecurityedu.entity.Member> findByUserid(String userId);
}
