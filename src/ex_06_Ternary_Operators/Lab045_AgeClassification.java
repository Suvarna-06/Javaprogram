package ex_06_Ternary_Operators;

public class Lab045_AgeClassification {
    public static void main(String[] args) {
    // Take input using CLI (command Line)
        String age_String = args[0];
        int age = Integer.parseInt(age_String);
        System.out.println(age);





        // Adult , Minor, Senior
        // Senior > 65,
        // Minor < 18
        // Adult > 18

//        int age =25;
        String result = (age<18) ? "Minor" : (age<65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
