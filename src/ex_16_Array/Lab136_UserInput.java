package ex_16_Array;

import java.util.Scanner;

public class Lab136_UserInput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size in integer only");
        int size=sc.nextInt();

        // int[] numbers = new int[size];
        // String names = new String[size];
        float[] names = new float[size];

        // for(int i =0; i<size; i++){
        for(int i =0;i< names.length;i++){
            System.out.println("Enter the number:");
            names[i] = sc.nextFloat();
        }


        System.out.println("=====");
        for(int i =0; i< names.length; i++){
            System.out.println(names[i]);
        }
    }
}
