package day3;

public class SwitchLab1 {
    public static void main(String[] args) {
        int grade = (int)(Math.random()*7)+1;
        
        switch (grade) {
        case 1, 2, 3:
            System.out.println(grade + " 학년은 저학년입니다.");
            break;
        case 4, 5, 6:
            System.out.println(grade + " 학년은 고학년입니다.");
            break;
        default:
            System.out.println("잘못된 값입니다.");
        	}
    }
}

