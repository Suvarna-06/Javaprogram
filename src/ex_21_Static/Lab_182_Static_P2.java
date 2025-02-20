package ex_21_Static;

public class Lab_182_Static_P2 {
public static void main(String[]args){
    ATB umesh = new ATB(944975255,"Umesh");
    ATB anubha = new ATB(944735255,"Anuba");

    System.out.println(umesh.phone_num);
    System.out.println(anubha.name);
    System.out.println(ATB.course_name);
    System.out.println(ATB.course_name);
    ATB.m1(); // It is common for all
}

}
class ATB{
    static String course_name = "ATB";
    int phone_num;
    String name;

    // Parameterised Constructor
    public ATB(int phone_num_c,String name_c){
        this.name = name_c;
        this.phone_num = phone_num_c;
    }

    void display(){
        System.out.println(this.phone_num + this.name+ course_name);
    }

    static void m1(){
        System.out.println("Mark attendence");
    }
}