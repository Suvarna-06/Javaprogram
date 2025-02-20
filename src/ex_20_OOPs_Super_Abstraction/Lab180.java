package ex_20_OOPs_Super_Abstraction;

public class Lab180 {

    public static void main(String[]args){
        Dutta d = new  Dutta();
       //   Pramod d = new  Dutta(); --->Dynamic dispatch with interface.
        d.display();
        System.out.println(d.a); // int a is public
    }
}



class Dutta implements Pramod{
    @Override
    public void display(){
        System.out.println(a);
    }
}





interface Pramod{
    int a = 10;
    void display();
}