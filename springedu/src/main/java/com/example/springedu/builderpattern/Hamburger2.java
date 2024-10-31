package com.example.springedu.builderpattern;

import lombok.*;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
class Hamburger2 {
    // 필수 매개변수
    private int bun;
    private int patty;
    // 선택 매개변수
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;
    /*
    public Hamburger2(int bun, int patty, int cheese, int lettuce, int tomato, int bacon) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.bacon = bacon;
    }*/
}

