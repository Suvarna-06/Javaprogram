package ex_19_OOPs_Part2.Encapsulation;

public class Lab166 {
    public static void main(String[]args){
       // If i try to access the username and password it will not take it show error
       GoodEncapVwoLogin vwoLogin = new GoodEncapVwoLogin("admin","pwd234");
        //System.out.println(vwoLogin.username);
    }
}
 class GoodEncapVwoLogin{
   private String username;
   private String password;

    public GoodEncapVwoLogin(String usr,String pwd){
        this.username = usr;
        this.password = pwd;
    }

 }