package ex_13_Functions;

public class Lab103_Ex3_Multiple_Argument {
    public static void main(String[] args) {
        // 3.With Parameters and Without Return Type
        greet_with_your_Full_name("Sandhya",  "Sankeshwar");
    }
    static void greet_with_your_Full_name(String First_name, String Last_name){
        System.out.println("Hi,Your name is " + First_name  +  Last_name);
    }
}
