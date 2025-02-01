package Task_31_Jan;

import java.util.Scanner;

public class Employee_Net_Salary {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic pay:");
        int Basic_Pay = sc.nextInt();
        System.out.println("enter the house rent allowance:");
        double HRM =sc.nextDouble();
        System.out.println("Enter the dearness allowance:");
        double DA =  sc.nextDouble();
        System.out.println(" Enter other allowance:");
        double OA = sc.nextDouble();
        System.out.println("Enter the tax rate:");
        double Tax_rate = sc.nextDouble();

        double Gross_Salary = (Basic_Pay + HRM + DA + OA);

        double Tax_deduction = Gross_Salary * (Tax_rate / 100);

        double Net_salary = (Gross_Salary -Tax_deduction);

        System.out.println("The net salary is Rs." +Net_salary);

    }
}
