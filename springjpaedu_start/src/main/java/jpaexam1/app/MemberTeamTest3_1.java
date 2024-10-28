package jpaexam1.app;

import jpaexam1.entity.Member;

import jakarta.persistence.*;
import java.util.Scanner;

public class MemberTeamTest3_1 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("회원명을 입력하세요 : ");
        String inputName = scan.nextLine();
        scan.close();
        
       String jpql = "select m.username, m.team.name, m.locker.name from Member m where m.username = :mn";
        
        Query q = em.createQuery(jpql);
        q.setParameter("mn", inputName);
        Member dto;
        try {
            Object[] result = (Object[])q.getSingleResult();
            System.out.printf("%s님은 %s팀 소속이고 %s 락커를 사용중입니다.%n", result[0], result[1], result[2]);
        } catch(NoResultException e) {
        	System.out.printf("%s님은 정보가 없습니다.%n", inputName);
        }
        em.close();
        factory.close();
	}
    class TestResult {
        String username;

    }
}
