package ex_08_Condition;

import java.util.Scanner;

public class Lab058_If_condition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age!(as integer");
        int age = sc.nextInt();

        if(age >18){
            System.out.println("You are allowed to vote!");
        }
        else{
            System.out.println("Not allowed!");
        }
    }
}
