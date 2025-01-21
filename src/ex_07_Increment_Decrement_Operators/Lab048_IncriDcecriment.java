package ex_07_Increment_Decrement_Operators;

public class Lab048_IncriDcecriment {
    public static void main(String[] args) {

        // Pre-increment -> ++ operand
        // value is incremented first and then stored in the result.
        int a = 10;
        int b =++a;
        System.out.println(b);
        System.out.println(a);

        // Exp and result table
        //   Line No | a | Result b|
        //     8     |10 |  NA
        //     9     |11 | 11 |
        //     10    |NA | 11 |
        //     11    |11 | NA |
    }
}
