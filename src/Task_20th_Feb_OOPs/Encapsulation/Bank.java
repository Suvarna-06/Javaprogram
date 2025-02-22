package Task_20th_Feb_OOPs.Encapsulation;

public class Bank {
    public static void main(String[]args){

        SBICustomer sbi = new SBICustomer("Shalini",45000);
//        System.out.println(sbi.name);
//        System.out.println(sbi.balance);


        // To change the name and balance
        sbi.setName("Sandhya");
        System.out.println(sbi.getName());
        boolean isAdmin = true;
        sbi.setBalance(50000.20,isAdmin);
        System.out.println(sbi.getBalance());
    }

}
class SBICustomer{
    private String name;
    private double balance;


// getter and setter method.
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance,boolean isAdmin){
        if(isAdmin){
            this.balance = balance;
        }
        else{
            System.out.println("Not allowed to change");
        }

    }

    public SBICustomer(String name,double balance){
        this.name=name;
        this.balance = balance;
    }

}