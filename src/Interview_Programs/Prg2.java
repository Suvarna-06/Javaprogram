package Interview_Programs;

import java.util.Scanner;

public class Prg2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to get the table:");
        int num = sc.nextInt();
        int n = 5;
        for(int i=1;i<=50;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }

    }
}
