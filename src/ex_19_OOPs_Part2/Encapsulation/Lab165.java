package ex_19_OOPs_Part2.Encapsulation;

public class Lab165 {
    // here the username and password are not hided
    public static void main(String[]args){
        VWOLogin vwoLogin = new VWOLogin("Kamli","2345");
        System.out.println(vwoLogin.password);
    }
}

class VWOLogin{
    // Data variables
    String username;
    String  password;
    public VWOLogin(String usr,String pwd){
        this.username = usr;
        this.password = pwd;
    }
}
