package Task_19th_Feb;

public class parameterized_constructor {
    public static void main(String[] args) {
        Bike1 b1 = new Bike1("Royal Enfield Bullet 350",2021);
        System.out.println(b1.model_name);
        System.out.println(b1.year_launch);
    }
}
class Bike1{
    String model_name;
    int year_launch;

    Bike1(String model_name_c,int year_launch_c){
        this.model_name = model_name_c;
        this.year_launch = year_launch_c;
        // 'this' keyword  is used to refer the current object within a instance or a constructor.
    }
}