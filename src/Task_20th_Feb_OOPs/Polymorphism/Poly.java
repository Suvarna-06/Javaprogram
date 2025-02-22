package Task_20th_Feb_OOPs.Polymorphism;

public class Poly {
    public static void main(String[]args){
        MakingCoffe mc = new MakingCoffe();
        System.out.println(mc.coffe());
        System.out.println(mc.milk_coffe());
    }


}

class MakingCoffe{
    String coffe(){
        return "Enjoy a hot cup of balck coffe";
    }

    String milk_coffe(){
        return "Enjoy delicious a hot cup of mikl coffe ";
    }
}
