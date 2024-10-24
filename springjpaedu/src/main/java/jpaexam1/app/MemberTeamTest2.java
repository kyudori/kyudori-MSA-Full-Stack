package jpaexam1.app;

import jpaexam1.entity.Member;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Scanner;

public class MemberTeamTest2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("팀명을 입력하세요 : ");
        String inputName = scan.nextLine();
        scan.close();
        
        String jpql = "select m from Member m where m.team.name = :tn";
        TypedQuery<Member> q = em.createQuery(jpql, Member.class);
        q.setParameter("tn", inputName);
        List<Member> list = q.getResultList();
        
        if (list.size() != 0) {
        	list.stream().forEach(System.out::println);
        } else {
        	System.out.printf("%s에는 팀원이 없습니다.%n", inputName);
        }
        em.close();
        factory.close();
	}
}
