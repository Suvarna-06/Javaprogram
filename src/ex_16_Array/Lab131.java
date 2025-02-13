package ex_16_Array;

import java.util.Arrays;

public class Lab131 {
    public static void main(String[]args){
        int[] marks ={51,100,91,87,90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("---------");

        for (int i = 0; i < marks.length ; i++) { // 0,1,2,3,4
            System.out.println(marks[i]);
        }

        Arrays.sort(marks); // 51,87,90,91,100

    }
}
