package ex_14_Strings;

public class Lab122_String_Function {
    public static void main(String[] args) {
            String another_palindrome = "Niagara. O roar again!";
            String roar=another_palindrome.substring(11,15);
            System.out.println(roar);

            String s1 ="Sandhya";
            String s2 = s1.concat("Sankeshwar");
            System.out.println(s2);
    }
}
