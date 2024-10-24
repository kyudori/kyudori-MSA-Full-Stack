package jpaexam2.model.dao;

import jpaexam2.model.entity.Emp;
import jpaexam2.model.dto.EmpFreqDTO;
import jakarta.persistence.*;
import java.util.List;

public class EmpDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("emptest");
    EntityManager em = factory.createEntityManager();
    public void close() {
    	em.close();
    	factory.close();
    }
	public Long getAllDataNum() {	
		TypedQuery<Long> q = em.createQuery("select count(t.empno) from Emp t", Long.class);
		return q.getSingleResult();   
	}
	
	public String getEmpName(Integer numOfEmp) {
		Emp e = em.find(Emp.class, numOfEmp);
		if (e != null)
			return e.getEname();
		else
			return "없음";
	}

	public List<Emp> findByJob(String job) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t WHERE t.job = :job", Emp.class);
		q.setParameter("job", job); 
		List<Emp> resultList = q.getResultList();
		return resultList;
	}

	public List<Emp> findByPartEname(String partEname) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t WHERE t.ename like :pe", Emp.class);
		q.setParameter("pe", "%"+partEname+"%"); 
		List<Emp> resultList = q.getResultList();
		return resultList;
	}
	
	public List<Emp> findByGreaterThanSal(int sal) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t WHERE t.sal >= :sal", Emp.class);
		q.setParameter("sal", sal); 
		List<Emp> resultList = q.getResultList();
		return resultList;
	}

	public List<Emp> findByEnameAndJob1(String ename, String job) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t WHERE t.ename = :ename and t.job = :job", Emp.class);
		q.setParameter("ename", ename); 
		q.setParameter("job", job); 
		List<Emp> resultList = q.getResultList();
		return resultList;
	}

	public Emp findByEnameAndJob2(String ename, String job) {
		TypedQuery<Emp>  q = em.createQuery("SELECT t FROM Emp t WHERE t.ename = ?1 and t.job = ?2", Emp.class);
		q.setParameter(1, ename); 
		q.setParameter(2, job); 
		Emp result = q.getSingleResult();
		return result;
	}
	
	public List<EmpFreqDTO> findByEmpFreqDTO() {
		TypedQuery<EmpFreqDTO>  q = em.createQuery("SELECT new EmpFreqDTO(t.empno, t.ename, t.hiredate, t.sal, t.deptno) FROM Emp t", EmpFreqDTO.class);
		List<EmpFreqDTO> resultList = q.getResultList();
		return resultList;
	}

	public List<Emp> listPart(int start, int num) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t ORDER BY t.sal DESC", Emp.class);
		q.setFirstResult(start);    // 조회 시작 위치
		q.setMaxResults(num);       // 조회할 데이터 수
		List<Emp> resultList = q.getResultList();
		return resultList;
	}
	
	public Object[] getGroupFunc() {	
		Query query = em.createQuery("SELECT sum(t.sal), max(t.sal), min(t.sal) FROM Emp t");
		Object[] result = (Object[])query.getSingleResult();
		return result;
	}
}
