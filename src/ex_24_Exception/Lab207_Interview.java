package ex_24_Exception;

public class Lab207_Interview {
    public static void main(String[] args) {
        final double pi =3.14;
        int a =0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by zero");
        } finally {
            System.out.println("I will be executed anyHow!! ");
        }
    }
}
