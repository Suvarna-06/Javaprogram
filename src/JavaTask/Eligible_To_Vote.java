package JavaTask;

import java.util.Scanner;

public class Eligible_To_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age");
        int Person_age = sc.nextInt();

        if(Person_age>18){
            System.out.println("Person is eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
}
