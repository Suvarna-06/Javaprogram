package Task_31_Jan;

import java.util.Scanner;

public class Number_Is_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int original_num = num;
        int reverse_num =0;

        while(num !=0){
            int digit=num % 10;
            reverse_num =reverse_num *10 + digit;
            num = num / 10;
        }
        if(original_num == reverse_num){
            System.out.println(original_num+ " is palindrome");
        }
        else {
            System.out.println(original_num+ " is not a palindrome ");
        }
    }
}
