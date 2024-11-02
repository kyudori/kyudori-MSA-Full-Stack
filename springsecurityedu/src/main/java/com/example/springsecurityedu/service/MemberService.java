package com.example.springsecurityedu.service;

import com.example.springsecurityedu.entity.Member;
import com.example.springsecurityedu.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository repository;

    @Autowired
    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Optional<com.example.springsecurityedu.entity.Member> findOne(String userId) {
        return repository.findByUserid(userId);
    }
}
