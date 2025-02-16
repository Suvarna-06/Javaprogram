package ex_19_OOPs_Part2.SingleInheritance.real_example;

public class TestCase2 extends CommonToAllTest{
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closetBrowser();
    }
}
