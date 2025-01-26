package ex_13_Functions;

import java.util.Scanner;

public class Lab112 {
    public static void main(String[] args) {
        // Create a Function of Division
        // with parameter, a, b (take the parameter from the User)

        //         // Logic Building

        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1 ");
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
            System.exit(0);
        }
        // BigInteger a = scanner.nextBigInteger();
        System.out.println("Enter the num2 ");
        int b = scanner.nextInt();

        int result_div = div(a,b);
        System.out.println(result_div);
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Div by Zero not allowed!");
        }
        return a / b;
    }
}
