package jpaexam1.app;

import jakarta.persistence.*;
import java.util.Scanner;

public class MemberTeamTest5 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        Scanner scan = new Scanner(System.in);
        System.out.print("멤버명을 입력하세요 : ");
        String inputName = scan.nextLine();
        scan.close();

        String jpql = "select m.team.name from Member m where m.username = :un";

        TypedQuery<String> q = em.createQuery(jpql, String.class);
        q.setParameter("un", inputName);
        String teamName;
        try {
            teamName = q.getSingleResult();
            System.out.printf("%s님의 팀명은 %s입니다...\n", inputName, teamName);
        } catch(NoResultException e) {
        	System.out.printf("%s님의 팀을 찾을 수 없네요..ㅜㅜ \n", inputName);
            e.printStackTrace();
        }
        em.close();
        factory.close();
	}
}
