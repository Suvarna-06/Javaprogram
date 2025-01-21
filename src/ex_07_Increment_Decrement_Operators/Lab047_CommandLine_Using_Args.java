package ex_07_Increment_Decrement_Operators;

public class Lab047_CommandLine_Using_Args {
    public static void main(String[] args) {
        String age_String = args[0];
        int age = Integer.parseInt(age_String);
        System.out.println(age);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[4]); // java.lang.ArrayIndexOutOfBoundsException

        String canIGoGoa = age >= 24 ? "yes" : "No";
        System.out.println(canIGoGoa);
    }

}
