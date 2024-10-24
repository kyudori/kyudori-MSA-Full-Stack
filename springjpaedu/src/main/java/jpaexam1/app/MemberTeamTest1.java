package jpaexam1.app;

import jpaexam1.entity.Locker;
import jpaexam1.entity.Member;
import jpaexam1.entity.Team;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MemberTeamTest1 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entitytest");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        
        Team t1 = new Team("1팀", "아기공룡둘리");
        Team t2 = new Team("2팀", "겨울왕국");
        Team t3 = new Team("3팀", "짱구는못말려");
        
        em.persist(t1);
        em.persist(t2);
        em.persist(t3);

        List<Locker> list = new ArrayList<Locker>();
        list.add(new Locker("A101"));
        list.add(new Locker("A102"));
        list.add(new Locker("A103"));
        list.add(new Locker("A104"));
        list.add(new Locker("B101"));
        list.add(new Locker("B102"));
        list.add( new Locker("B103"));
        list.add(new Locker("B104"));

        for (Locker e : list) {
                em.persist(e);
        }
        
        Member m1 = new Member("둘리", t1, list.get(0));
        Member m2 = new Member("또치", t1, list.get(1));
        Member m3 = new Member("도우너", t1, list.get(2));
        
        Member m4 = new Member("올라프", t2, list.get(3));
        Member m5 = new Member("안나", t2, list.get(4));
        
        Member m6 = new Member("짱구", t3, list.get(5));
        Member m7 = new Member("흰둥이", t3, list.get(6));
        Member m8 = new Member("짱아", t3, list.get(7));
        
        em.persist(m1);
        em.persist(m2);
        em.persist(m3);
        em.persist(m4);
        em.persist(m5);
        em.persist(m6);
        em.persist(m7);
        em.persist(m8);  
        
        System.out.println("team, locker 그리고 membertbl 테이블에 데이터 저장~~ ");
        em.getTransaction().commit();       
        em.close();
        factory.close();
	}
}
