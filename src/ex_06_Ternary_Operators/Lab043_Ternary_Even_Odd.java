package ex_06_Ternary_Operators;

public class Lab043_Ternary_Even_Odd {
    public static void main(String[] args) {
        int num =7;
        String result = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}