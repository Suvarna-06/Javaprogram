package Task_19th_Feb;

public class Default_constructor {
   public static void main(String[]args){
       Bike b = new Bike(); //
       System.out.println("This is a default constructor");
       System.out.println("Model:"+b.model);// It will return 'null'
       System.out.println("Year: " + b.year); // It will return 0
   }

}

class Bike {
    String model;
    int year;
}