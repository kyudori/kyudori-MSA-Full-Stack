package jpaexam1.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jpaexam2.model.entity.Emp;

import java.util.List;

public class HelloJPA4 {
    public static void main(String[] args) throws Exception {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();

        Query q = em.createQuery("select t from Emp t", Emp.class);
        List<Emp> empList = q.getResultList();
        for (Emp elem : empList) {
            System.out.println("직원명 : " + elem.getEname());
            Thread.sleep(1000);
            if (elem.getDeptno() != null)
                System.out.println("  부서명 : " + elem.getDeptno().getDname());
            else
                System.out.println("  부서명 : 없음");
        }
        System.out.println("데이터 갯수 : " + empList.size());

        em.close();
        factory.close();
    }
}
