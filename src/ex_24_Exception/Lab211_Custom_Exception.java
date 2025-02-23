package ex_24_Exception;

public class Lab211_Custom_Exception {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank icic = new Bank("INR",123);
        Bank JP = new Bank("USD",100);
       // int result = sbi.add(icic);
        int result = sbi.add(JP);
        System.out.println(result );
    }
}
