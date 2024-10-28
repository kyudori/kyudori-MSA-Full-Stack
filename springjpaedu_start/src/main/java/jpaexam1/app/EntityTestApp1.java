package jpaexam1.app;

import jpaexam1.entity.EntityTest1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EntityTestApp1 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        EntityTest1 et;
        em.getTransaction().begin();
        
        for(int i=1; i < 6; i++) {
        	et = new EntityTest1();
        	et.setName("둘리"+i);
        	et.setAge(10+i);
        	et.setBirthday(LocalDateTime.now());
        	em.persist(et);
        }
        System.out.println("엔터키.....");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        scan.close();
        em.getTransaction().commit();       
        em.close();
        factory.close();
	}
}
