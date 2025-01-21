package ex_07_Increment_Decrement_Operators;

public class Lab054_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> ExpA ->11, a -> 11 -U1
        //+
        // ++a -> ExpB ->12, a -> 12
        //ExpA + ExpB -> 11 +12 -> 23
    }
}
