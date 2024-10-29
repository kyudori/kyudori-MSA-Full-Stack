package com.example.springjpaedu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Book {
    @Id
    private int id;;
    private String kind;
    private String title;
    private int price;
}
