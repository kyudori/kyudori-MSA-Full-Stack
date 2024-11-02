package com.example.springsecurityedu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class BCryptEncoderTest {
    @Autowired
    private PasswordEncoder encoder;
    @Test
    void test() {
        String pass1 = encoder.encode("1234");
        String pass2 = encoder.encode("1234");
        System.out.println("pass1 = " + pass1);
        System.out.println("pass2 = " + pass2);

        System.out.println(encoder.matches("1234", pass2));
    }
}
