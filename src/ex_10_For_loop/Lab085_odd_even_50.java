package ex_10_For_loop;

public class Lab085_odd_even_50 {
    public static void main(String[] args) {
        for(int i =0;i<=50;i++){
            if(i%2==0){
                System.out.println("Even -> " +i);
            }
            else{
                System.out.println("Odd -> " + i);
            }
        }
    }
}
