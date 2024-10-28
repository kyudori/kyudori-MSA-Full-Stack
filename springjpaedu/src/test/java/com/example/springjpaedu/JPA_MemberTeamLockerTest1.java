package com.example.springjpaedu;

import com.example.springjpaedu.entity.Member;
import com.example.springjpaedu.repository.MemberTeamLockerRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class JPA_MemberTeamLockerTest1 {
    @Autowired
    private MemberTeamLockerRepository repo;
    
    @BeforeEach
    void pr() {
    	System.out.println("=".repeat(80));
    }

    @Test
    void test1() {
        List<Member> list = repo.findAll();
        list.stream().forEach(System.out::println);
    }
    @Test
    void test2() {
        List<Member> list = repo.getAllData();
        list.stream().forEach(System.out::println);
    }
    @Test
    void test3() {
        List<Member> list = repo.getAllDataFetchJoin();
        list.stream().forEach(System.out::println);
    }
    @AfterAll
    static void end() {
        System.out.println("=".repeat(80));
        System.out.println("[[[[[[ 테스트 종료 ]]]]]]");
    }
}
