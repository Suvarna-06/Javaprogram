package ex_21_Static;

public class Lab184_Real {
}


class ATB1{
    {
        System.out.println("IIB - this is called when object is created!");
    }

    private String name; // non static
    private String phone; // non static
    static String courseName = "ATB10x";

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    public String getPhone(){
        return getPhone();
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    static void readDocuments(){
        System.out.println("Non static Method");
        System.out.println();
    }

    static void doAssignment(){
        //System.out.println(phone); // Static method can't access the non static variables.
        System.out.println("Do Assignment");

        // But non static methods can access static variables.
    }

}