package ex_18_OOPs_Constructors;

public class Lab156_Para_Con {
    public static void main(String[]args){
        Mobile iphone = new Mobile();
        Mobile oneplus =new Mobile();
        System.out.println(iphone.model_name);
        System.out.println(oneplus.model_name);
    }
}
class Mobile{
    // instance variable or attributes
    String model_name = "Oppo";
    String year_Of_launch = "2024";

    // If we assign the value directly then
    // when we execute with the creation of the object
    // it shows the same value for iphone and oneplus
    // so we need to have different value for different object.
}

