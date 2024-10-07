package jdbcexam.lab;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner scan = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("처리하려는 기능을 선택하세요.");
            System.out.println("1. 학생 정보 출력");
            System.out.println("2. 학생 정보 입력");
            System.out.println("3. 학생 점수 확인");
            System.out.println("4. 종료");
            System.out.print("입력: ");

            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    List<StudentDTO> studentList = dao.getAllStudent();
                    for (StudentDTO student : studentList) {
                        System.out.println(student);
                    }
                    break;

                case 2:
                    System.out.print("학생 이름: ");
                    String name = scan.nextLine();
                    System.out.print("학생 점수: ");
                    int score = Integer.parseInt(scan.nextLine());
                    
                    StudentDTO newStudent = new StudentDTO(name, score);
                    if (dao.insertStudent(newStudent)) {
                        System.out.println("입력 성공");
                    } else {
                        System.out.println("입력 실패");
                    }
                    break;

                case 3:
                    System.out.print("점수를 확인할 학생 이름: ");
                    String studentName = scan.nextLine();
                    StudentDTO studentToCheck = new StudentDTO(studentName, 0);
                    StudentDTO result = dao.getScore(studentToCheck);

                    if (result == null) {
                        System.out.println(studentName + " 학생은 존재하지 않습니다.");
                    } else {
                        System.out.println(result.getName() + " 학생의 점수는 " + result.getScore() + " 입니다.");
                    }
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }

        scan.close();
    }
}
