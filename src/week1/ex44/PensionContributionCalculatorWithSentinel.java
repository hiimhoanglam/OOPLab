package week1.ex44;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculatePensionWithSentinel(sc);
    }
    public static void calculatePensionWithSentinel(Scanner sc) {
        System.out.print("Enter the monthly salary (or -1 to end): $");
        int salary = sc.nextInt();
        while (salary != -1) {
            System.out.print("Enter the age: ");
            int age = sc.nextInt();
            calculatePension(salary,age);
            System.out.print("Enter the monthly salary (or -1 to end): $");
            salary = sc.nextInt();
        }
        System.out.println("Bye!");
    }
    public static void calculatePension(int salary, int age) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.75;

        int contributableSalary;
        double employeeContribution;
        double employerContribution;
        double totalContribution;

        if (salary >= SALARY_CEILING) {
            contributableSalary = SALARY_CEILING;
        }
        else {
            contributableSalary = salary;
        }
        if (age <= 55) {
            employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
        }
        else if (age <= 60) {
            employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
        }
        else if (age <= 65) {
            employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
            employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
        }
        else {
            employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
            employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
        }
        System.out.printf("The employee's contribution is : $%.2f\n",employeeContribution);
        System.out.printf("The employer's contribution is : $%.2f\n",employerContribution);
        totalContribution = employeeContribution + employerContribution;
        System.out.printf("The total contribution is: $%.2f\n",totalContribution);
    }
}
