package Interview_Programs;

import java.util.Scanner;

public class Prg1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.next();
        System.out.println("Enter a age");
        int age = sc.nextInt();
        System.out.println("Hello "+name+" You are "+age+ " years old");
    }
}
