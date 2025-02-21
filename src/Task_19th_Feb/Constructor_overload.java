package Task_19th_Feb;

public class Constructor_overload {
    public static void main(String[] args) {
        // calling different constructors
        Bike2 bike2 = new Bike2();
        bike2.display();
        Bike2 bike3 = new Bike2("Gt 650");
        bike3.display();
        Bike2 bike4 = new Bike2("Ghost rider", 2020);
        bike4.display();
        // Display



    }
}

class Bike2 {
    // Attributes
    String model;
    int year;

    // Default constructor
    Bike2() {
        this.model = "Unknown";
        this.year = 0;
        System.out.println("Default constructor");
    }

    // One-parameter constructor
    Bike2(String model_c) {
        this.model = model_c;
        System.out.println("Parameterized constructor with one parameter");
    }

    // Two-parameter constructor
    Bike2(String model_c, int year_c) {
        this.model = model_c;
        this.year = year_c;
        System.out.println("Parameterized constructor with two parameters");
    }

    void display() {
        System.out.println("Model: " + model + " Year: " + year);
    }
}
