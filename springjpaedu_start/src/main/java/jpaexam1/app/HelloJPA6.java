package jpaexam1.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jpaexam2.model.entity.Emp;

import java.util.List;

public class HelloJPA6 {
    public static void main(String[] args) throws Exception {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();

        String fetchJoinJpql = "select distinct t " +
                               "from Emp t left join fetch t.deptno " +
                               "left join fetch t.deptno.loc_code";
        Query q = em.createQuery(fetchJoinJpql, Emp.class);
        List<Emp> empList = q.getResultList();
        for (Emp elem : empList) {
            System.out.println(elem);
        }
        System.out.println("데이터 갯수 : " + empList.size());

        em.close();
        factory.close();
    }
}
