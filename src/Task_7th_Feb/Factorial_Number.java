package Task_7th_Feb;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }System.out.println("Factorial of "+ num+ " is "+factorial );

    }
}
