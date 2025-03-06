package Task_5th_March;

public class Protected_AccessModifier {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.makeSound();

        // cat.energy = 50;     // ERROR! Protected field not accessible
    }
}


class Animal{
    protected int energy = 100;   // Only Animal and subclasses can access

    protected void rest(){
        energy = 100;
        System.out.println("Animal rested Energy: " + energy);
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow!");
        energy = energy -10;               // Can access protected parent field
        System.out.println("Energy:" + energy);
        rest();                           // Can call protected parent method
    }
}