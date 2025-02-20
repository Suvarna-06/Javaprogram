package ex_22_ENUM;

public class Lab187_Enum_P2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if(URLS.katalon.equals("Katalon")){
            System.out.println("I want to do somethings!");
        }
    }
}

enum URLS{
    goggle,restassured,katalon,
}