package ex_25_Generics;

public class Lab215 {
    public static void main(String[] args) {
        temp(23,45);
        temp(true,123);
        temp("pramod","Lucky");
    }

   // public static <pramod> pramod temp(pramod a, pramod b )
     public static <T> T temp(T a, T b ){
         System.out.println(a);
         System.out.println(b);
         return null;
        // Using 'T' it can be any type of data .
    }
}
