package ex_24_Exception;

public class Lab201_Good {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            c = 10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
