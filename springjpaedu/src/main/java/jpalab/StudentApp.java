package jpalab;

import jpalab.controller.StudentController;
import java.util.Scanner;

public class StudentApp {

    private static StudentController sc = new StudentController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("처리하려는 기능을 선택하세요.");
            System.out.println("1. 학생 정보 출력");
            System.out.println("2. 학생 정보 입력");
            System.out.println("3. 학생 정보 삭제");
            System.out.println("4. 학생 정보 수정");
            System.out.println("5. 학생 점수 확인");
            System.out.println("6. 종료");
            System.out.print("입력: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 6) break;

            switch (choice) {
                case 1 -> sc.printAll();
                case 2 -> {
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("점수: ");
                    int score = scanner.nextInt();
                    sc.insert(name, score);
                }
                case 3 -> {
                    System.out.print("삭제할 학생 이름: ");
                    String name = scanner.nextLine();
                    sc.delete(name);
                }
                case 4 -> {
                    System.out.print("수정할 학생 이름: ");
                    String name = scanner.nextLine();
                    System.out.print("새 점수: ");
                    int score = scanner.nextInt();
                    sc.update(name, score);
                }
                case 5 -> {
                    System.out.print("조회할 학생 이름: ");
                    String name = scanner.nextLine();
                    sc.printScore(name);
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
        scanner.close();
    }
}

