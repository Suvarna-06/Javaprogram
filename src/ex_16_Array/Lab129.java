package ex_16_Array;

public class Lab129 {
    public static void main(String[]args){
        int [] marks ={1,2,3,4,5,6};
        // 2nd Type
        int[] marks2 = new int[5];// Fixed Size.

        //int marks3[]=new int [5]; // Fixed size
        System.out.println(marks.length);
        String s1 = "Sandhya";
        System.out.println(s1.length());

        marks2[0] = 91;
        marks2[1] = 12;
        marks2[2] = 13;
        marks2[3] = 14;
        marks2[4] = 15;

        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //System.out.println(marks[10]); // ArrayIndexOutOfBoundsException



    }
}
