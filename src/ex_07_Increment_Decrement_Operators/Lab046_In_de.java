package ex_07_Increment_Decrement_Operators;

public class Lab046_In_de {
    public static void main(String[] args) {
        // Take inputs using CLI (command Line)
        String age_String = args[0];
        int age = Integer.parseInt(age_String);
        System.out.println(age);

        String canIGoGoa = age >= 24 ? "yes" : "No";
        System.out.println(canIGoGoa);
    }
}
