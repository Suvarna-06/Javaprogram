package ex_09_Switch;

public class Lab068_Switch_JDK_13_Concept {
    public static void main(String[] args) {

        int itemcode =001;

        switch(itemcode){
            case 001,002,005:
                System.out.println("All of them are the electronics gadgets");
                break;
            case 004,006,007:
                System.out.println("this is Mech");
                break;
            default:
                System.out.println("None");

        }
    }
}
