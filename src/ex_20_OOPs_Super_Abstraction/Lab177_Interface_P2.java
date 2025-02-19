package ex_20_OOPs_Super_Abstraction;

public class Lab177_Interface_P2 {

}



 class P implements I1{
    // This is how we complete the function by overriding it.
    @Override
     public void incomplete1(){
        System.out.println("ICM1 complete");
        P p = new P();
        p.incomplete1(); // these are comming from hidden functions
        p.incomplete2();
    }

     @Override
     public void incomplete2(){
         System.out.println("ICM2 complete");
     }
 }
interface I1{
    void incomplete1();
    void incomplete2();
    // the above incomplete function wait for someone to complete them
}


interface I2{
    void incomplete3();
}
