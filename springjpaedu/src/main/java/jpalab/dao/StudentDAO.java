package jpalab.dao;

import jpalab.entity.StudentEntity;
import jakarta.persistence.*;
import java.util.List;

public class StudentDAO {
    private EntityManagerFactory factory;
    public StudentDAO() {
        super();
        factory = Persistence.createEntityManagerFactory("emptest");
    }

    public boolean insertStudent(StudentEntity student) {
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            em.close();
            return false;
        }
    }

    public List<StudentEntity> getAllStudent() {
        EntityManager em = factory.createEntityManager();
        //return em.createQuery("SELECT s FROM StudentEntity s", StudentEntity.class).getResultList();
        List<StudentEntity> list = em.createQuery("SELECT s FROM StudentEntity s", StudentEntity.class).getResultList();
        em.close();
        return list;
    }

    public StudentEntity getScore(String studentName) {
        EntityManager em = factory.createEntityManager();
        return em.find(StudentEntity.class, studentName);
    }

    public boolean updateStudent(StudentEntity student) {
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            //em.merge(student);
            StudentEntity oldStudent = em.find(StudentEntity.class, student.getName());
            oldStudent.setName(student.getName());
            oldStudent.setScore(student.getScore());
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            em.close();
            return false;
        }
    }

    public boolean deleteStudent(String studentName) {
        EntityManager em = factory.createEntityManager();
        try {
            StudentEntity student = em.find(StudentEntity.class, studentName);
            if (student != null) {
                em.getTransaction().begin();
                em.remove(student);
                em.getTransaction().commit();
                em.close();
                return true;
            }
            em.close();
            return false;
        } catch (Exception e) {
            em.close();
            return false;
        }
    }
    public void close() {
        if (factory != null)
            factory.close();
    }
}
