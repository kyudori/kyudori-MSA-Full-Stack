package com.example.springsecurityedu2;

import com.example.springsecurityedu2.entity.MyUser;
import com.example.springsecurityedu2.repository.MyUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
public class AdminManagerAccountCreateTest {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private MyUserRepository repository;

    @Test
    @Rollback(false)
    @Transactional
    void save() {
        MyUser mu = MyUser.createUser("adm@java.com", "9999", passwordEncoder, "ADMIN");
        repository.save(mu);
        mu = MyUser.createUser("mgr@java.com", "8888", passwordEncoder, "MANAGER");
        repository.save(mu);
        List<MyUser> list = repository.findAll();
        list.stream().forEach(System.out::println);
    }
}
