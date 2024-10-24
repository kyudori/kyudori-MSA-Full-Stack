package jpalab;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jpalab.entity.Book;

public class JPASelectBook {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();

        int choice = (int) (Math.random() * 5) + 1;

    switch (choice) {
        case 1:
            em.createQuery("SELECT b FROM Book b", Book.class).getResultList()
                    .forEach(System.out::println);
            break;
        case 2:
            em.createQuery("SELECT b FROM Book b ORDER BY b.price DESC", Book.class)
                    .getResultList().forEach(System.out::println);
            break;
        case 3:
            em.createQuery("SELECT b.title FROM Book b WHERE b.price < 20000", String.class)
                    .getResultList().forEach(System.out::println);
            break;
        case 4:
            em.createQuery("SELECT b FROM Book b WHERE b.title LIKE '%자바%'", Book.class)
                    .getResultList().forEach(System.out::println);
            break;
        case 5:
            long count = em.createQuery("SELECT COUNT(b) FROM Book b", Long.class)
                    .getSingleResult();
            System.out.println("도서는 모두" + count + "권 입니다.");
            break;
    }
        System.out.println("추출된 숫자 -----> " + choice);
    }
}
