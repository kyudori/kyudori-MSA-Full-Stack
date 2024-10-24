package jpaexam1.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
import jpaexam2.model.entity.Emp;

public class HelloJPA3 {
    public static void main(String[] args) {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();

        Query q = em.createQuery("select t from Emp t", Emp.class);
        List<Emp> empList = q.getResultList();
        for (Emp elem : empList) {
            System.out.println(elem.getEname());
        }
        System.out.println("데이터 갯수 : " + empList.size());
        em.close();
        factory.close();
    }
}
