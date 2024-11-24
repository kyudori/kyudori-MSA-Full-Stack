package com.example.spingvueedu1.entity;

import com.example.spingvueedu1.repository.JwtMemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class JwtMemberTest {
    @Autowired
    private JwtMemberRepository repo;
    @Test
    @Transactional
    @Rollback(false)
    void save() {
        JwtMember entity = new JwtMember();
        entity.setEmail("duke@java.com");
        entity.setPassword("1234");
        repo.save(entity);
        List<JwtMember> list = repo.findAll();
        list.stream().forEach(System.out::println);
    }
}