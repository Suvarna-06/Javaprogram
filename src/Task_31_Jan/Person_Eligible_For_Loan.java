package Task_31_Jan;

import java.util.Scanner;

public class Person_Eligible_For_Loan {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age =sc.nextInt();
        System.out.println("Enter the salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter the credit score:");
        int credit_score=sc.nextInt();

        boolean isAge_Valid =false;
        boolean isSalary_Valid = false;
        boolean iscreditScore_Valid = false;

        if(age>0 || age>18 && age>=80){
            isAge_Valid =true;
        }
        else {
            System.out.println(" age is not eligible");
        }
         if (salary>0 && salary>=30000) {
             isSalary_Valid = true;
         }
         else{
            System.out.println("salary is not eligible");
        }
          if (credit_score>0 && credit_score>=650 && credit_score<=850) {
              iscreditScore_Valid = true;
          }
          else{
            System.out.println(" credit score is not eligible");
          }
       if(isAge_Valid && isSalary_Valid && iscreditScore_Valid){
           System.out.println("Yes ! You are eligible to take a loan");
        }
       else {
           System.out.println("Sorry! you are not eligible for a loan");
       }
    }
}
