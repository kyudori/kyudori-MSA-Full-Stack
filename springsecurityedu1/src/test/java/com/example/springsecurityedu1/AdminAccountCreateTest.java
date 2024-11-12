package com.example.springsecurityedu1;

import com.example.springsecurityedu1.entity.Member;
import com.example.springsecurityedu1.repository.MemberRepository;
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
@SpringBootTest  // 여기서는 @DataJpaTest 를 사용하면 안됨, 테스트 전에 시큐리티 관련 설정도 해야 하기 때문
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
