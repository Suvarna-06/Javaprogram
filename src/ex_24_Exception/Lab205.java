package ex_24_Exception;

public class Lab205 {
    public static void main(String[] args) {

        try {
            String ip = args[0];  // lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);// java.lang.NumberFormatException
            int b = 100/a; //java.lang.ArithmeticException
            System.out.println(b);
        }
        // This is the GOOD practice of a programmer
        catch (NumberFormatException |ArithmeticException  | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
    }
}
