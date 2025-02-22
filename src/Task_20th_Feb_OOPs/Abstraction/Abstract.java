package Task_20th_Feb_OOPs.Abstraction;

public class Abstract {
    public static void main(String[]args){
        Daughter d= new Daughter();
        d.loan30k();
        d.goldloan60k();
    }
}
//
abstract class Mother{
    abstract void loan30k();
    abstract void goldloan60k();
    void electricityBill(){
        System.out.println("Paid 4k as electricity Bill");
    }
}

class Daughter extends Mother{
    @Override
    void loan30k(){
        System.out.println("Daughter has to pay 30k");
    }

    @Override
    void goldloan60k(){
        System.out.println("Again daughter has to pay 60k as gold laon");
    }
}