package ex_24_Exception;

public class Lab198_Exception_handling {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10/0;
        } catch (Exception e) {
            // e.printStckTrace () --> This means full problem details with line no
            System.out.println("Are u fool? / by zero is not possible");
            // System.out.println(e.getMessage());
        }
        System.out.println("2");


        // e.printStckTrace () --> This means full problem details with line no
    }
}
