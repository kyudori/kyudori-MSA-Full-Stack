package jpalab.dao;

import jpalab.entity.StudentEntity;
import jakarta.persistence.*;
import java.util.List;

public class StudentDAO {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("emptest");
    private EntityManager em = factory.createEntityManager();

    public boolean insertStudent(StudentEntity student) {
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public List<StudentEntity> getAllStudent() {
        return em.createQuery("SELECT s FROM StudentEntity s", StudentEntity.class).getResultList();
    }

    public StudentEntity getScore(String studentName) {
        return em.find(StudentEntity.class, studentName);
    }

    public boolean updateStudent(StudentEntity student) {
        try {
            em.getTransaction().begin();
            //em.merge(student);
            student.setName(student.getName());
            student.setScore(student.getScore());
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public boolean deleteStudent(String studentName) {
        try {
            StudentEntity student = em.find(StudentEntity.class, studentName);
            if (student != null) {
                em.getTransaction().begin();
                em.remove(student);
                em.getTransaction().commit();
                return true;
            }
            return false;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }
}

