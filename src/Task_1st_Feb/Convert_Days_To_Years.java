package Task_1st_Feb;

import java.util.Scanner;

public class Convert_Days_To_Years {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the day:");
        int total_days = sc.nextInt();
         int year = total_days / 365;
         int remaining_days_after_year = total_days % 365;
         int months = remaining_days_after_year /30;
         int  days = remaining_days_after_year % 30;

        System.out.println(total_days+" days "+ months+ " months "+ days+ "days");
    }

}
 //1000 days is equivalent to 2 years, 9 months, and 0 days.