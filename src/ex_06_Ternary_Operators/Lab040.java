package ex_06_Ternary_Operators;

public class Lab040 {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int number =-5;
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}