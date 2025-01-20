package ex_05_TypeCasting;

public class Lab036__TypeCasting_Narrowing {
    public static void main(String[] args) {
       int val =200;
       // Byte b = val; // Invalid -> Implicit Casting narrowing is not allowed
       byte b =(byte)val; //  valid -> Explicit Casting narrowing is allowed
        // Data loss:

    }
}
