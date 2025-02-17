package ex_19_OOPs_Part2.Encapsulation;

public class Lab167_Getter_Setter_Mtd {
    public static void main(String[]args){
    EncapVwoLogin encapVwoLogin = new EncapVwoLogin("amit","988");
    encapVwoLogin.setUsername("Suvarna");
        System.out.println(encapVwoLogin.getUsername());
        boolean isAdmin = true;
    encapVwoLogin.setPassword("097",true);
        System.out.println(encapVwoLogin.getPassword());
    }
}
class EncapVwoLogin{
    private String username;
    private String password;

// Whichever you want to change indirectley use GETTER and SETTER Method
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password,boolean isAdmin){
        if(isAdmin){
            this.password = password;
        }
        else{
            System.out.println("Not allowed to change password");
        }

    }

    public EncapVwoLogin(String usr,String pwd){
        this.username = usr;
        this.password = pwd;
    }

}
