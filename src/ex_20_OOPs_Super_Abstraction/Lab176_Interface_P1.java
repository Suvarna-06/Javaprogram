package ex_20_OOPs_Super_Abstraction;

public class Lab176_Interface_P1 {
    public static void main(String[]args){
        Car1  car1= new Car1();
        car1.drive();
    }
}
class Car1 implements Engine1,Brakes{ // we can have multiple interfaces

    void drive(){
        startEngine();
        applyBrake();
        stopEngine();
    }


    @Override
    public void applyBrake(){
        System.out.println("Apply brake");
    }

    @Override
    public void startEngine(){
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stop engine!");

    }
}

interface Engine1{
    void startEngine();
    void stopEngine();
}

interface Brakes {
    void applyBrake();
    // void test(){
    // We cannot have a complete function in interface but in abstraction we can have
    // But we have one "Default function in interface"
    // }
    default void test(){
        System.out.println("concrete means complete");
    }
}