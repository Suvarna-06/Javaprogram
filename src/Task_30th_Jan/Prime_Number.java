package Task_30th_Jan;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        Boolean isprime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }

        }
        System.out.println(isprime);
    }
}
