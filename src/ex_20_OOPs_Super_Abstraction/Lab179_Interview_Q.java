package ex_20_OOPs_Super_Abstraction;

public class Lab179_Interview_Q {
    interface I11{} // Possible
    interface  I22{}
    class A1{
    }
    class B1{
        // possible
    }

    class Test1 extends A1{}
  // class Test2 extends A1, B1 // Multiple inheritance not allowed

  class Test3 implements I11{}
  class Test4 implements I22,I11{}
  class Test5 extends A1 implements I11,I22{}
 //  class Test5 implements I11 extends A1{} Not possible
}
