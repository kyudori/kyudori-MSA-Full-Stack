package day10;

public class SalaryExam {
    public static void main(String[] args) {
        int month = (int)(Math.random() * 12) + 1;
        int grade = (int)(Math.random() * 4) + 1;

        System.out.println("Month: " + month + ", Grade: " + grade);

        SalaryExpr salaryExpr;
        if (month == 1 || month == 5 || month == 7 || month == 10 || month == 12) {
            salaryExpr = new SalaryExpr(100);
        } else {
            salaryExpr = new SalaryExpr();
        }

        int salary = salaryExpr.getSalary(grade);
        System.out.println(month + "월 " + grade + "등급의 월급은 " + salary + "입니다.");
    }
}
