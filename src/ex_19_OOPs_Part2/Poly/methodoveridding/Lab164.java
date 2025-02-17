package ex_19_OOPs_Part2.Poly.methodoveridding;

public class Lab164 {
    public static void main(String[]args){
        Pramod pr = new Pramod();
        pr.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Pramod();
        // when pramod is bron father is present.
        // This is called "DYNAMIC DISPATCH"
        f2.home(); // Here the pramod home is executed
        // because we have created the object of the pramod
        // This is called ----> method overriding >> ridden the father method.
        // using the keyword "Override".

    }


}
