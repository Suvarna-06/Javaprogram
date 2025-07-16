package ex_14_Strings;

public class Lab118 {
    public static void main(String[] args) {
        String s1 = "Hello"; // This creates a string literal  and stores it in the String Pool, which is a special memory area in Java for string constants.
        String s2 = new String("Hello"); // This explicitly creates a new  object in the heap memory.
        // Even though the value of  is also ,
        // it’s a separate object and doesn’t refer to the  in the String Pool.
    }
}
