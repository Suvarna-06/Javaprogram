package JavaTask;
import java.util.Scanner;
public class Number_Even_Odd {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if(n % 2 ==0){
            System.out.println("Even number");
        }
        else if (n % 2 != 0) {
            System.out.println("Odd number");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
