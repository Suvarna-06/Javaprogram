package JavaTask;
import java.util.Scanner;

public class Number_Postive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Number is Positive:" +num);
        }
        else {
            System.out.println("Number is Negative:" +num);
        }
    }
}
