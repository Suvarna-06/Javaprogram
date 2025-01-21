package ex_07_Increment_Decrement_Operators;

public class Lab051_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // Exp and result table
        //   Line No. | Exp(result)  |a |
        //     5     | NA |  10 |
        //     6     | result = 10 | 11 |
        //     7     | result = 10 | 11 |
    }
}
