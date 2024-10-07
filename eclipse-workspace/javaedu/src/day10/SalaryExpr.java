package day10;

public class SalaryExpr {
    int bonus;

    SalaryExpr() {
        this.bonus = 0;
    }

    SalaryExpr(int bonus) {
        this.bonus = bonus;
    }

    int getSalary(int grade) {
        int salary = 0;
        switch (grade) {
            case 1:
                salary = this.bonus + 100;
                break;
            case 2:
                salary = this.bonus + 90;
                break;
            case 3:
                salary = this.bonus + 80;
                break;
            case 4:
                salary = this.bonus + 70;
                break;
        }
        return salary;
    }
}
