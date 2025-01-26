package ex_13_Functions;

public class Lab104 {
    public static void main(String[] args) {

        greet_with_details("Sandhya",45, 60000.90);
        greet_with_details("Sandhya",45, 60000.90);
    }
    static void greet_with_details(String name,int age,double salary){
        System.out.println("Your name is ->" + name + " Your age is "+ age + " Your salary is" + salary);
    }
}
