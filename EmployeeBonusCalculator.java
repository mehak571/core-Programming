import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 10;
        double[] salary = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonus = new double[NUM_EMPLOYEES];
        double[] newSalary = new double[NUM_EMPLOYEES];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            
            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary. Try again.");
                i--; // Decrement index to retry
                continue;
            }

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service. Try again.");
                i--; // Decrement index to retry
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        
        System.out.println("\nEmployee-wise Details:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout: ₹" + String.format("%.2f", totalBonus));
        System.out.println("Total Old Salary: ₹" + String.format("%.2f", totalOldSalary));
        System.out.println("Total New Salary: ₹" + String.format("%.2f", totalNewSalary));
    }
}
