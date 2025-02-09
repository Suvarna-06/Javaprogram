package Task_7th_Feb;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table:");
        int num= sc.nextInt();
        System.out.println("Multiplication table of "+num);
        int i =1;
        while(i<=10){
            System.out.println(num+ "x" +i+ "=" +(num*i));
            i++;
        }

    }
}
