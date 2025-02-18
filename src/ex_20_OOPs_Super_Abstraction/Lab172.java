package ex_20_OOPs_Super_Abstraction;

public class Lab172 {
    public static void main(String[]args){
        Car c1 = new Car();
        c1.display();
    }

}

// Single Inheritance
class Car extends Vehicle{
    private int maxSpeed = 280;

// parent constructor can be called in the own constructor
    Car(){
        super(100); // It will call Parametrised Constructor(Parent)

    }

    void test(){

    }

    Car(int a){
        System.out.println("PC of car");
    }


@Override
    void display(){
    System.out.println("Overide - Car");
    System.out.println(super.maxSpeed); // 180 - Parent MaxSpeed of line 32 of code
    System.out.println(this.maxSpeed); // own class maxSpeed of line 9 of code.
    this.test(); // calling line 17 function
    super.notest(); // calling parent function of line 40.
    }

}

class Vehicle{
    public int maxSpeed = 180;

    void notest(){

    }




    // Default Constructor
    Vehicle(){
        System.out.println("Default Constru");
    }
    // Parametrised Constructor
    Vehicle(int a){
        System.out.println("Para Con");
    }


    // Method  Overloading - Same class same name functiom with different arguments.
    // Function with no parameter and No return type
    void message(){
        System.out.println("No Return, No argument");
    }

    void message(int a){
        System.out.println("PC - argument");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }

}
