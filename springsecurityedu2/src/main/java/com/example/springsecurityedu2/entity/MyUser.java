package com.example.springsecurityedu2.entity;

import jakarta.persistence.*;

import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String roles;

    /*public List<String> getRoleList(){
        if(this.roles.length() > 0){
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }*/

    public static MyUser createUser(String userId, String pw, PasswordEncoder passwordEncoder, String role) {
        return new MyUser(null, userId, passwordEncoder.encode(pw), role);
    }
}
