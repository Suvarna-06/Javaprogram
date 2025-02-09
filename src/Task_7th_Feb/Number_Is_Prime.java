package Task_7th_Feb;
import java.util.Scanner;

public class Number_Is_Prime {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number:");
                int num = sc.nextInt();
                int count = 0;

                for (int i = 1; i <= num; i++) {
                        if (num % i == 0) {
                                count++;
                        }
                }
                // Print result AFTER the loop finishes
                System.out.println(count == 2 ? "Prime Number" : "Not Prime Number");
        }
}