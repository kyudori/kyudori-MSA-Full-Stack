package jpaexam1.app;

import jpaexam1.entity.EntityTest1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class EntityTestApp3 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        EntityTest1 et;
        em.getTransaction().begin();
        
        for(int i=11; i < 16; i++) {
        	et = new EntityTest1();
        	et.setName("도우너"+i);
        	et.setAge(10+i);
        	et.setBirthday(LocalDateTime.now());
        	em.persist(et);
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("엔터키.....");
        scan.nextLine();  
        TypedQuery<EntityTest1> q = em.createQuery("select t from EntityTest1 t", EntityTest1.class);
    	List<EntityTest1> list = q.getResultList();
    	list.stream().forEach(System.out::println);
    	
    	for(int i=21; i < 26; i++) {
        	et = new EntityTest1();
        	et.setName("또치"+i);
        	et.setAge(10+i);
        	et.setBirthday(LocalDateTime.now());
        	em.persist(et);
        }    	
    	System.out.println("엔터키.....");
        scan.nextLine();  
        em.flush();

        q = em.createQuery("select t from EntityTest1 t", EntityTest1.class);
        list = q.getResultList();
        list.stream().forEach(System.out::println);
        
        System.out.println("엔터키.....");
        scan.nextLine();  
        em.getTransaction().rollback();
        em.close();       
        factory.close();
        scan.close();
	}
}
