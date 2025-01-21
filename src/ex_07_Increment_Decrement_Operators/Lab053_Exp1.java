package ex_07_Increment_Decrement_Operators;

public class Lab053_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> ExpA ->10, a->11
        //+
        // ++a -> ExpB ->12, a->12
        //ExpA + ExpB -> 10 +12 -> 22
    }
}
