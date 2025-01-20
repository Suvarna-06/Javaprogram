package ex_05_TypeCasting;

public class Lab038_TypeCasting_used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        int total_int = course+(int)GST; //Narrow -> Explicit possible
        //int total_int = course+GST; //Narrow -> Implicit is not possible
        float total = course+GST;// Widening -> Implicit
        float total2 = (float)course+GST; // Widening - Explicit
        System.out.println(total);

    }
}
