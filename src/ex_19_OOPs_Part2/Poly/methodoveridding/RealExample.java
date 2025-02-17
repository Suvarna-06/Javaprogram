package ex_19_OOPs_Part2.Poly.methodoveridding;

public class RealExample {
    public static void main(String[]args){
    TC t1 = new TC();
    t1.openBrowser();
    TC2 t2 = new TC2();
    t2.openBrowser();

    }
}
class CommonTOAllTc{
    void openBrowser(){
        System.out.println("Open the browser in 5 sec");
    }
}

class TC extends CommonTOAllTc{
    void startTC(){
        openBrowser();
    }
}

class TC2 extends CommonTOAllTc{
    @Override
    // override means adding0  new
    void openBrowser(){
        System.out.println("Open the browser in 2 sec");
    }
}
