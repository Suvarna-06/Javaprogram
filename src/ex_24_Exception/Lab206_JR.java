package ex_24_Exception;

public class Lab206_JR {
    public static void main(String[] args) {
        try {
            String ip = null; // lang.ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int a = 0; //java.lang.NumberFormatException
        try {
           // a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        int b =0;
        try {
            b =100/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);

    }
}
