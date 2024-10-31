package com.example.springedu.builderpattern;

public class Hamburger2App {
    public static void main(String[] args) {
        Hamburger2 dooly = Hamburger2.builder().bun(1).patty(1).cheese(1).lettuce(2).tomato(1).bacon(1).build();

        Hamburger2 ddochi = Hamburger2.builder().bun(1).patty(1).cheese(0).lettuce(2).tomato(2).bacon(1).build();
        Hamburger2 dounar = Hamburger2.builder().bun(1).patty(2).cheese(1).lettuce(0).tomato(0).bacon(2).build();new Hamburger1(1,2,1,0,0,2) ;
        Hamburger2 gogildong = Hamburger2.builder().bun(1).patty(2).cheese(3).build();
        Hamburger2 micol = Hamburger2.builder()
                                        .bun(2)
                                        .bacon(6)
                                        .build();

        System.out.printf("둘리의 햄버거 : %s %n", dooly);
        System.out.printf("또치의 햄버거 : %s %n", ddochi);
        System.out.printf("도우너의 햄버거 : %s %n", dounar);
        System.out.printf("고길동의 햄버거 : %s %n", gogildong);
        System.out.printf("마이콜의 햄버거 : %s %n", micol);
    }
}
