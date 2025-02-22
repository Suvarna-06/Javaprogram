package Task_21st_Feb_OOPs;

public class Method_Overriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle bicycle = new Bicycle();

        vehicle.move();
        bicycle.move();
    }
}


class Vehicle{
    // method in super class
    void move(){
        System.out.println("Vehicle is moving");
    }
}

class Bicycle extends Vehicle{
    // Overriding the move method in the subclass
      @Override
    void move(){
          System.out.println("Bicycle is pedaling forward");
      }

}