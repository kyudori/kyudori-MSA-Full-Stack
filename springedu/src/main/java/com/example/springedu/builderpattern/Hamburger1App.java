package com.example.springedu.builderpattern;

public class Hamburger1App {
    public static void main(String[] args) {
        Hamburger1 dooly = new Hamburger1(1,1,1,2,1,1) ;
        Hamburger1 ddochi = new Hamburger1(1,1,0,2,2,1) ;
        Hamburger1 dounar = new Hamburger1(1,2,1,0,0,2) ;
        Hamburger1 gogildong = new Hamburger1(1,2,3) ;
        Hamburger1 micol = new Hamburger1(2, 0, 0, 0, 0, 6);

        System.out.printf("둘리의 햄버거 : %s %n", dooly);
        System.out.printf("또치의 햄버거 : %s %n", ddochi);
        System.out.printf("도우너의 햄버거 : %s %n", dounar);
        System.out.printf("고길동의 햄버거 : %s %n", gogildong);
        System.out.printf("마이콜의 햄버거 : %s %n", micol);
        System.out.printf("마이콜의 햄버거 : %s %n", micol);
    }
}
