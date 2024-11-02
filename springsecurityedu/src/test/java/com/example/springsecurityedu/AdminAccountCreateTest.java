package com.example.springsecurityedu;

import com.example.springsecurityedu.entity.Member;
import com.example.springsecurityedu.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
public class AdminAccountCreateTest {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private MemberRepository repository;

    @Test
    @Rollback(false)
    @Transactional
    void save() {
        Member member = Member.createUser("duke@java.com", "9999", passwordEncoder, "ADMIN");
        repository.save(member);
        List<Member> list = repository.findAll();
        list.stream().forEach(System.out::println);
    }
}
