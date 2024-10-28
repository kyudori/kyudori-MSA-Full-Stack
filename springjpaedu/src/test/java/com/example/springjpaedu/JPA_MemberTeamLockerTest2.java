package com.example.springjpaedu;

import com.example.springjpaedu.entity.Member;
import com.example.springjpaedu.repository.MemberTeamLockerRepository;
import com.example.springjpaedu.repository.TeamName;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class JPA_MemberTeamLockerTest2 {
    @Autowired
    private MemberTeamLockerRepository repo;
    
    @BeforeEach
    void pr() {
    	System.out.println("=".repeat(80));
    }
    @Test
    void test1() {
        List<Member> list = repo.findByTeamName("겨울왕국");
        list.stream().forEach(System.out::println);
    }
    @Test
    void test2() {
        List<Member> list = repo.getWithJPQL1("겨울왕국");
        list.stream().forEach(System.out::println);
    }
    @Test
    void test3() {
        TeamName result = repo.getByUsername("둘리");
        System.out.println(result.getTeamName());
    }
    @Test
    void test4() {
        String teamName = repo.getWithJPQL2("둘리");
        System.out.println(teamName);
    }
    @AfterAll
    static void end() {
        System.out.println("=".repeat(80));
        System.out.println("[[[[[[ 테스트 종료 ]]]]]]");
    }
}
