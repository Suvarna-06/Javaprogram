package ex_24_Exception;

public class Lab200 {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try{
            c = 10/c;
        }
        // this is bad programming
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
