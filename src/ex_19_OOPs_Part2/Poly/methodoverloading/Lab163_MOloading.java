package ex_19_OOPs_Part2.Poly.methodoverloading;

public class Lab163_MOloading {
    public static void main(String[]args){
        MathOperation m1 = new MathOperation();
        int r =m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(2,4,8);
        System.out.println(r1);

        double r2 = m1.add(2.333,5.678);
        System.out.println(r2);
    }

}
