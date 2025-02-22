package ex_20_OOPs_Super_Abstraction;

public class Lab175_AC {
    public static void main(String[] args) {
        Wagon wagon = new Wagon();
        wagon.drive();
    }
}
// Car --> Engine, Start, Stop
// Wagon R --> Car

class Wagon extends Engine{
    @Override
    void startEngine(){
        System.out.println("Start");
    }
    @Override
    void stopEngine(){
        System.out.println("Stop");

    }

    void drive(){
        startEngine();
        System.out.println("I am driving");
        stopEngine();
    }
}

abstract  class Engine{
     abstract void startEngine();
     abstract void stopEngine();
}