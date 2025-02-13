package ex_16_Array;

import java.util.Arrays;

public class Lab135_InterviewQ {
    public static void main(String[]args){
        // Find the largest number in an array
         int []numbers={12,34,56,34,22,100,8,15};
         Arrays.sort(numbers);

         System.out.println(numbers[numbers.length-1]);
    }
}
