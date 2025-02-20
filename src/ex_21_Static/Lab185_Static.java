package ex_21_Static;

public class Lab185_Static {
    public static void main(String[]args){
        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        Automation.driver ="FireFox";
        System.out.println(Automation.driver);
    }
}

class Automation{
    static String driver ="Chrome";

    // Static is called before the constructor when the class is loaded
    // Satic value can be changed as shown in line 8 and 9..
}