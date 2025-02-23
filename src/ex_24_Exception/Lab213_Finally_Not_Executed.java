package ex_24_Exception;

public class Lab213_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a =10/0;
            System.out.println(a);
            System.exit(0); // This will terminate the program before going to catch
            // System.exit(0); --> can only stop the execution of the finally block
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello Last");
        }
    }
}
