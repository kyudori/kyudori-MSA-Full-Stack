package com.example.springnews.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String writer;
    private String content;
    @CreationTimestamp
    @Column(name = "writedate", updatable = false)
    private Date writeDate;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private News news;
}
