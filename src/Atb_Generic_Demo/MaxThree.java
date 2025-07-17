package Atb_Generic_Demo;

public class MaxThree {

    public static <DT extends Comparable<DT>> DT maximunOf(DT a, DT b, DT c) {
        DT max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximunOf(23, 56, 88));
        System.out.println(maximunOf(4.5, 6.6, 66.7));
        System.out.println(maximunOf('w', 'a', 'z'));
    }
}
