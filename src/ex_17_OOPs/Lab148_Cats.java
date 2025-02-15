package ex_17_OOPs;

public class Lab148_Cats {
    public static void main(String[]args){

        Cat c1 = new Cat(); // object is created with object reference as c1
        //Cat c2; // initialize with null value
        new Cat(); // Here only object is created without the object refernce


        c1.running();
        //c2.running(); // java.lang.NullPointerException
    }

}

class Cat{
    String name;

    void running(){
        System.out.println("Running");

    }
}