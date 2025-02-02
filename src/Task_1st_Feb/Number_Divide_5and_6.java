package Task_1st_Feb;

import java.util.Scanner;

public class Number_Divide_5and_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:");
        int number = sc.nextInt();

        if(number % 5 ==0 && number % 11 ==0){
            System.out.println("The number "+ number+ " is divisible by both 5 and 11.");
        }
        else{
            System.out.println("The number "+ number+ " is  not divisible by both 5 and 11.");
        }
    }
}
