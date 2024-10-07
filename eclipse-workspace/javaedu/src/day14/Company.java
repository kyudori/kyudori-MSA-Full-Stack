package day14;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = {
            new Secretary("Duke", 1, "Secretary", 800),
            new Sales("Tuxi", 2, "Sales", 1200)
        };

        printEmployee(employees, false);

        for (Employee emp : employees) {
            if (emp instanceof Bonus) {
                ((Bonus) emp).incentive(100);
            }
        }

        System.out.println("\n[인센티브 100 지급]");
        
        printEmployee(employees, true);
    }

    public static void printEmployee(Employee[] emp, boolean isTax) {
        System.out.println("name\tdepartment\tsalary\textra pay\ttax");

        for (Employee e : emp) {
            String extraPay = "";
            String tax = "";

            if (e instanceof Sales) {
                extraPay = String.format("%.1f", ((Sales) e).getExtraPay());
            }

            if (isTax) {
                tax = String.format("%.1f", e.tax());
            }

            System.out.printf("%s\t%s\t%d\t%s\t%s%n",
                e.getName(), e.getDepartment(), e.getSalary(), tax, extraPay);
        }
    }
}
