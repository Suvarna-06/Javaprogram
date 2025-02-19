package ex_20_OOPs_Super_Abstraction;

public class Lab178_Multiple_Inheritance_Solved {
    public static void main(String[]args){
        Child1 child = new Child1();
        child.f1();
        child.m1();
        child.money(); // only 1 money is allowed "DUBPLICATE" is not allowed.
        //   Actually it is fake no one is giving money to child,
        // here child will spend his own money.
    }

}

class Child1 implements Mother1,Father1{

    // Now implement all the methods by overriding

    @Override
    public void money(){
        System.out.println("Only 1 money");
    }


    @Override
    public void m1(){

    }

    @Override
    public void f1(){

    }

}



interface Mother1{
    void money();
    void m1();
}

interface Father1{
    void money();
    void f1();


    default void ff(){
        System.out.println("This is only allowed");
    }
}
