package ex_23_Wrapper_Class;

public class Lab194_Wrapper_Conversion {
    public static void main(String[] args) {
        String num ="10";

        //String -> wrapper conversion
        Integer a = Integer.parseInt(num); // Wrapper String -> Wrapper conversion.

        // String -> Primitive
        int a3 = Integer.parseInt(num);

    //Using parseInt() we can convert wrapper string and primitve data type.

        Integer aa = Integer.valueOf("10");
        System.out.println(aa);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
