package jpalab.controller;

import jpalab.dao.StudentDAO;
import jpalab.entity.StudentEntity;

public class StudentController {

    private StudentDAO dao = new StudentDAO();

    public void printAll() {
        dao.getAllStudent().forEach(System.out::println);
    }

    public void printScore(String studentName) {
        StudentEntity student = dao.getScore(studentName);
        if (student == null) {
            System.out.println(studentName + " 학생은 존재하지 않습니다.");
        } else {
            System.out.println(studentName + " 학생의 점수는 " + student.getScore() + "입니다.");
        }
    }

    public void insert(String name, int score) {
        boolean result = dao.insertStudent(new StudentEntity(name, score));
        if (result) {
            System.out.println("입력 성공");
        }else {
            System.out.println("입력 실패");
        }
    }

    public void update(String name, int score) {
        boolean result = dao.updateStudent(new StudentEntity(name, score));
        if (result) {
            System.out.println(name + " 학생의 점수를 변경했습니다.");
        }
        else{
            System.out.println(name + " 학생은 존재하지 않습니다.");
        }
    }

    public void delete(String name) {
        boolean result = dao.deleteStudent(name);
        if (result) {
            System.out.println(name + " 학생의 데이터를 삭제했습니다.");
        }
        else {
            System.out.println(name + " 학생은 존재하지 않습니다.");
        }
    }
    public void close() {
        dao.close();
    }
}
