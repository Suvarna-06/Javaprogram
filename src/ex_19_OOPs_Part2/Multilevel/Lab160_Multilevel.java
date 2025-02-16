package ex_19_OOPs_Part2.Multilevel;

public class Lab160_Multilevel {
    public static void main(String[]args){
        Son pramod = new Son();
        pramod.bhk3();
        pramod.fh();
        pramod.extra();
        pramod.home();
        pramod.home();
        System.out.println("--------");

        // Father has limited
        Father f = new Father();
        f.extra(); // own property
        f.home(); // grandfather property
        f.fh(); // grandfather property
        System.out.println("--------");

        //Grandfather property
        GrandFather gf = new GrandFather();
        gf.fh(); // own property
        gf.home();


        // If the son and grandfather both have the home function and when
        // we are calling the function it will call the function for  which the object is created in that particular class
        // this is called prefe rences


        // Son s1 = new Father()
        // Son s1 = new Grandfather();
        // Son amit = new new Son()

        GrandFather g1 = new Son();
        GrandFather g2 = new Father();
        Father f2 = new Son();

    }
}
