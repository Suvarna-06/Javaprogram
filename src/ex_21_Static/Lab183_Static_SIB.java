package ex_21_Static;

public class Lab183_Static_SIB {
    public static void main(String[]args){
        A a = new A();
    }
}


class A{
    static{
        System.out.println("Called SIB");
        System.out.println("Called only once when Class is loaded");
    }
    static int a = 10;
    static void m1(){
        System.out.println("Static Function");
    }

//    static class B{
        // Not useful
//    }
}