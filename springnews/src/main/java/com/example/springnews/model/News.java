package com.example.springnews.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Getter
@Setter
@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String writer;
    private String title;
    private String content;
    @CreationTimestamp
    @Column(name = "writedate", updatable = false)
    private Date writeDate;
    private int cnt;
}
