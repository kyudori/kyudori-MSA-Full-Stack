package jpaexam1.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jpaexam1.entity.Member;

import java.util.List;

public class MemberTeamTest4_1 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        String jpql = "select m from Member m";
        TypedQuery<Member> q = em.createQuery(jpql, Member.class);
        List<Member> list = q.getResultList();
        list.stream().forEach(System.out::println);
        em.close();
        factory.close();
	}
}
