package jpaexam1.app;

import jpaexam1.entity.EntityTest1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class EntityTestApp2 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
       	TypedQuery<EntityTest1> q = em.createQuery("select t from EntityTest1 t", EntityTest1.class);
    	List<EntityTest1> list = q.getResultList();
    	list.stream().forEach(e -> System.out.println(e));
		em.close();
        factory.close();
	}
}
