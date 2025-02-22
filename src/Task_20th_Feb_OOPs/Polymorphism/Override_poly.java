package Task_20th_Feb_OOPs.Polymorphism;

public class Override_poly {
    public static void main(String[]args){
        Bird b = new Bird();
        Bird spr = new sparrow();
        b.fly();
        spr.fly();
    }
}
class Bird{
    void fly(){
        System.out.println("Bird is flying");
    }
}

class sparrow extends Bird{
    // Override the fly() method in the subclass
    @Override
    void fly(){
        System.out.println("Sparrow is also flying");
    }
}