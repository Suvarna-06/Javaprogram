package ex_06_Ternary_Operators;

public class Lab039 {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int age =18;
        String canIVote = age>=18 ? "yes, You can vote" : "No you cant vote";
        System.out.println(canIVote);
    }
}
