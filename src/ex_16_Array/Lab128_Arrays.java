package ex_16_Array;

public class Lab128_Arrays {
    public static void main(String[]args){
        int a = 10;
        int [] marks = { 91,90,51,100,92};

        //Arrays creation withthe predefined elements

        System.out.println("Length of the array is:"+marks.length);
        System.out.println(marks[0]);
        // System.out.println(marks[-1]); // java.lang.ArrayIndexOutOfBoundsException
        // System.out.println(marks[10]);
    }
}
