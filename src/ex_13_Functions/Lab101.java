package ex_13_Functions;

public class Lab101 {
    public static void main(String[] args) {

        // 2.Without Parameters but With Return Type
        String s = greet_with_hello();
        System.out.println(s);
    }

    static String greet_with_hello(){
        return "Hi, How are you";
    }
}
