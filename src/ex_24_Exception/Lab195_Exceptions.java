package ex_24_Exception;

public class Lab195_Exceptions {
     public static void main(String[]args){

         System.out.println("Start the program");
         String ip = args[0];
         int a = Integer.parseInt(ip);
         int b = 100/a;
         System.out.println(b);
         System.out.println("end the program");
     }


     //java.lang.ArithmeticException: When we make a = 0

    // java.lang.NumberFormatException : When i enter args[0] = "pramod"

    // .lang.ArrayIndexOutOfBoundsException : when we enter nothing
}
