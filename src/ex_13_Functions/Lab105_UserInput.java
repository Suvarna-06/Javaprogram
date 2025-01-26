package ex_13_Functions;

import java.util.Scanner;

public class Lab105_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your name");
        double salary = sc.nextDouble();

    }

}
