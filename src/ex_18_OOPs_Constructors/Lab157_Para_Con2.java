package ex_18_OOPs_Constructors;

public class Lab157_Para_Con2 {

    public static void main(String[]args){
        Mobilee iphone = new Mobilee("iphone","2007");
        Mobilee oneplus =new Mobilee("onplus","2013");
        Mobilee samsung = new Mobilee("Ultra","2025");
        System.out.println(iphone.model_name);
        System.out.println(oneplus.model_name);
        System.out.println(samsung.model_name);

        iphone.display();
    }
}
class Mobilee {
    String model_name ;
    String year_Of_launch ;

    // so we create a parameterised constructor to have a different value
    //for different object
    Mobilee(String model_name_c, String year_Of_launch_c){
        this.model_name = model_name_c;
        this.year_Of_launch = year_Of_launch_c;
    }

    public void display(){
        System.out.println(this.model_name + " - " + this.year_Of_launch);
    }
}


// based on the 'iphone' object refernce in 6 line, the line in 22 and 23 variables of reference changes.

// All of them have their own attributes and behaviour
// in that different modelname,year of launch and display .

