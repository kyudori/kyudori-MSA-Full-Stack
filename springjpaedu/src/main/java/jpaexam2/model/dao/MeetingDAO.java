package jpaexam2.model.dao;

import jpaexam2.model.entity.Meeting;
import jpaexam2.model.entity.Reply;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class MeetingDAO {
	
	private EntityManagerFactory factory;
	
	public MeetingDAO() {
		super();
		factory = Persistence.createEntityManagerFactory("emptest");
	}

	public List<Meeting> listM() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Meeting>  q = em.createQuery("select t from Meeting t", Meeting.class);
		List<Meeting> list = q.getResultList();
		em.close();
		return list;
	}
	
	public Meeting oneM(int id){
		EntityManager em = factory.createEntityManager();
		Meeting vo = em.find(Meeting.class, id);
		em.close();
		return vo;
	}

	public boolean insertM(Meeting vo) {
		boolean result = true;
		EntityManager em = factory.createEntityManager();
		try {			
			em.getTransaction().begin();
			em.persist(vo);
			em.getTransaction().commit();
		} catch (Exception e) {
			result = false;
		}
		em.close();
		return result;
	}

	public List<Meeting> searchM(String name) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Meeting> q = em.createQuery("select t from Meeting t WHERE t.name = :name", Meeting.class);
		q.setParameter("name", name);
		List<Meeting> list = q.getResultList();
		em.close();
		return list;
	}

	public boolean deleteM(int id) {
		boolean result = true;
		EntityManager em = factory.createEntityManager();
		try {		
			em.getTransaction().begin();
			Meeting vo = em.find(Meeting.class, id);
			em.remove(vo);
			em.getTransaction().commit();
		} catch (Exception e) {
			result = false;
		}
		em.close();
		return result;
	}
	
	public boolean updateM(Meeting vo) {
		boolean result = true;
		EntityManager em = factory.createEntityManager();
		try {			
			em.getTransaction().begin();
			Meeting oldVo = em.find(Meeting.class, vo.getId());
			oldVo.setName(vo.getName());
			oldVo.setTitle(vo.getTitle());
			oldVo.setMeetingDate(vo.getMeetingDate());
			em.getTransaction().commit();
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		em.close();
		return result;	
	}

	public List<Reply> listReplyByMettingId(int refid) {
		EntityManager em = factory.createEntityManager();
		//Meeting mvo = em.find(Meeting.class, refid);
		TypedQuery<Reply> q = em.createQuery("select t from Reply t WHERE t.refid.id = :refid", Reply.class);
		q.setParameter("refid", refid);
		List<Reply> list = q.getResultList();
		em.close();
		return list;		
	}

	public boolean insertReply(Reply vo) {
		boolean result = true;
		EntityManager em = factory.createEntityManager();
		try {			
			em.getTransaction().begin();
			System.out.println(vo);
			em.persist(vo);
			em.getTransaction().commit();
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		em.close();
		return result;		
	}

	public void close() {
		if (factory != null)
			factory.close();
	}
	
	public List<Reply> listR() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Reply> q = em.createQuery("select t from Reply t", Reply.class);
		List<Reply> list = q.getResultList();
		em.close();
		return list;
	}
}
