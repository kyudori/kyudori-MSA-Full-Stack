package com.example.spingvueedu1.entity;

import jakarta.persistence.*;
import lombok.Getter;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class JwtMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;
}
