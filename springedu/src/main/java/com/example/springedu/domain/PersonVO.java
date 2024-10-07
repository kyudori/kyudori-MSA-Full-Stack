package com.example.springedu.domain;

public class PersonVO {
    private String name;
    private int age;
    public PersonVO() {
        System.out.println("PersonVO 객체 생성-1");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + '\'' + ", age=" + age + '}';
    }
}