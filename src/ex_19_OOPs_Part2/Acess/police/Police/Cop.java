package ex_19_OOPs_Part2.Acess.police.Police;

public class Cop {
    public int gun;
    String  iCard;

    // constructor created only for gun
    public Cop(int gun){
        this.gun = gun;
    }
    // protected within the folder
   protected void CanIShoot(){
        System.out.println("Yes you can shoot");
    }
}
