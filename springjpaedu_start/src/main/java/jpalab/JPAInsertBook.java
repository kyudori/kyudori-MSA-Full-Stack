package jpalab;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jpalab.entity.Book;


public class JPAInsertBook {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        System.out.println("1권");
        Book book = new Book();
        book.setTitle("이것이 자바다");
        book.setKind("b01");
        book.setPrice(10000);
        em.persist(book);

        System.out.println("2권");
        book = new Book();
        book.setTitle("모던 자바스크립트 핵심 가이드");
        book.setKind("b01");
        book.setPrice(19800);
        em.persist(book);

        System.out.println("3권");
        book = new Book();
        book.setTitle("그림과 실습으로 배우는 도커 & 쿠버네티스");
        book.setKind("b02");
        book.setPrice(28000);
        em.persist(book);

        System.out.println("4권");
        book = new Book();
        book.setTitle("MySQL로 배우는 데이터베이스 개론과 실습");
        book.setKind("b02");
        book.setPrice(27000);
        em.persist(book);

        em.getTransaction().commit();
        em.close();
        factory.close();
    }
}
