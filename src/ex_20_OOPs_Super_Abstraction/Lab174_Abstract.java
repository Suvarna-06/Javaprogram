package ex_20_OOPs_Super_Abstraction;

public class Lab174_Abstract {
    public static void main(String[]args){
        Child c = new Child();
        c.loan50k();
        c.loan20k();

        //Father f1 = new Father();// Abstract class don't have any object.
    }

}

// abstract class
abstract class Father{
  abstract  void loan50k(); // Incomplete method are present into it.
  void loan20k(){
      System.out.println("Given 20K");
  }
}
class Child extends Father{
    // Now child has to pay the 50K loan by overriding the father
    @Override
    void loan50k(){
        System.out.println("Child will pay the loan");
    }

}