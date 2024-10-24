package jpaexam1.app;

import jpaexam1.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class MemberTeamTest7 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();

        Member m = em.find(Member.class, 2); // id 는 알아서 입력
        System.out.println(m);
        System.out.println("=".repeat(50));
        Query q = em.createNativeQuery("select * from membertbl order by username", Member.class);
        List<Member> list = q.getResultList();

        if (list.size() != 0) {
            list.stream().forEach(System.out::println);
        }
        System.out.println("=".repeat(50));
        q = em.createNativeQuery("select username from membertbl order by username");
        List<String> namelist = q.getResultList();

        if (namelist.size() != 0) {
            namelist.stream().forEach(System.out::println);
        }
        System.out.println("=".repeat(50));
        TypedQuery<Member> tq = em.createQuery("select m from Member m", Member.class);
        List<Member> empList = tq.getResultList();
        for (Member elem : empList) {
            System.out.println(elem);
        }
        em.close();
        factory.close();
	}
}
