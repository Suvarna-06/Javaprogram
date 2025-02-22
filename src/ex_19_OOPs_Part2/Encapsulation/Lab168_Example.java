package ex_19_OOPs_Part2.Encapsulation;

public class Lab168_Example {
    public static void main(String[]args){
    ICICIBank amit = new ICICIBank("Amit",100);
        // System.out.println(amit.bal); // directley cannot print we have to use get and set metd.
        System.out.println(amit.getBal());

        // to change the balance
        boolean isCashier = true;
        amit.setBal(100000,isCashier);
        System.out.println(amit.getBal());

    }
}

class ICICIBank{
    // Encapusulation is a fundamental concept in OOPs
    // - Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public String getName(){
        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public long getBal(){
      return bal;
    }
    public void setBal(long bal, boolean isCashier){
        if(isCashier){
            this.bal = bal;
        }
        else{
            System.out.println("Not allowed");
        }
    }


    public ICICIBank(String name,long bal){
        this.name = name;
        this.bal = bal;
    }





}
