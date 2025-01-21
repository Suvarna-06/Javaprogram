package ex_07_Increment_Decrement_Operators;

public class Lab_049_PostIncrement {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);
        System.out.println(a);

        // Post-increment => Print first and then increment
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}
