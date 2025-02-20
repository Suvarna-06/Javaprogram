package ex_23_Wrapper_Class;

public class Lab193 {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // Boxing - int ->Integer -JVM AutoBoxing.
       //Autoboxing -> a will now have attributes and behaviour
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());

        Integer a2 = 44;
        int v = a2; // Unboxing
    // Primitive types does not have attributes and behaviour
        // When it is to the wrapper class it will have attri and behav.
    }
}
