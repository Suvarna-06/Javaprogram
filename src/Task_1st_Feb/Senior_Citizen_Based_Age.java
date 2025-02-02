package Task_1st_Feb;

import java.util.Scanner;

public class Senior_Citizen_Based_Age {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age:");
        int age = sc.nextInt();

        if(age>=0 && age<=12){
            System.out.println(age+" age comes under child criteria");
        } else if (age>=13 && age<=19) {
            System.out.println(age+" age comes under Teenager criteria");
        } else if (age>=20 && age<=64) {
            System.out.println(age+" age comes under adult criteria");
        }
        else {
            System.out.println(age+" age comes under Senior citizen criteria");
        }
    }
}
