package ex_19_OOPs_Part2.superkeyword;

public class Lab171 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();
    }
}
class Father{
    // father constructor
    Father(){
        System.out.println("Dc");
    }
    int gold = 10;
    void home(){
        System.out.println("Home Father");
    }
}

class Son extends Father{
    // son can call the father constructor within the son constructor
    Son(){
        super(); // calling father constructer.
    }
    void t1(){
        super.home(); // call the father's home
        System.out.println(super.gold);
    }
}
