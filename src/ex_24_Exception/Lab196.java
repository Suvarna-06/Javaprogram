package ex_24_Exception;

public class Lab196 {
    public static void main(String[]args){

        int a =0;
        int b = 10;
        int c =b/a;
        System.out.println(c);

        // Unchecked ->ArithmeticException , NullPointerException

        //java.lang.ArithmeticException: / by zer -Unchecked --> because during the compile time JVM does not know

        String name = null;
        name.trim();

        // java.lang.NullPointerException : Cannot invoke "String.trim()"
    }
}
