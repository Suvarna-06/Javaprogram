package Task_5th_March;

public class Public_AcessModifier {
    public static void main(String[] args) {

        Car c = new Car();      // Can access public field
        c.brand ="Toyota";
        c.drive();             // Can call public method

    }
}

class Car{
public String brand;          // Anyone can access

public void drive(){         // Anyone can call
    System.out.println(brand+" is driving!");
}

    }