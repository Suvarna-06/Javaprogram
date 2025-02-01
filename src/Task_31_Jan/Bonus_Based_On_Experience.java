package Task_31_Jan;

import java.util.Scanner;

public class Bonus_Based_On_Experience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter the year of experience:");
        int year_Of_Experience = sc.nextInt();
        double bonus = 0;

        if(year_Of_Experience<1){
            bonus = 0;
        } else if (year_Of_Experience >= 1 && year_Of_Experience<=3) {
            bonus =salary * 0.05;
        }
        else if (year_Of_Experience >= 4 && year_Of_Experience<=6) {
            bonus =salary * 0.10;
        }
        else if (year_Of_Experience >6) {
            bonus =salary * 0.15;
        }
        System.out.println("The bonus  for "+ year_Of_Experience + " years of experience is Rs." +bonus);
    }
}
