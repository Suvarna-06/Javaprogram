package Task_21st_Feb_OOPs;

public class Method_Overloading {
    public static void main(String[]args){
        Calculator calc = new Calculator();
        System.out.println(calc.add(3,8));
        System.out.println(calc.substract(10,7));
    }
}

class Calculator{
    // Method to add two integers
    int add(int a,int b){
        return a+b;
    }

    // Method to substract two integers
    int substract(int a, int b){
        return a-b;
    }
}
