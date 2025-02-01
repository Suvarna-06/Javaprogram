package Task_31_Jan;

import java.util.Scanner;

public class Visa_Status {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the visa status(valid/invalid):");
        boolean visa_status= sc.nextBoolean();

        if(age>=18 && visa_status){
            System.out.println("The person can travel");
        }
        else{
            System.out.println("The person cannot travel");
        }

    }
}
