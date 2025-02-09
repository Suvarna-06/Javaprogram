package Task_7th_Feb;

public class Reverse_Pyramid {
    public static void main(String[]args){
        for(int i=9; i>=1; i-=2){                              // If i = 9, j = 0, k = 1-9, print = 9 stars (*********)
            for(int j=0; j<(9 - i)/2; j++){                   // If i = 7, j = 1, k = 1-7, print = 7 stars (*******)
                System.out.print("");                        // If i = 5, j = 2, k = 1-5, print = 5 stars (*****)
            }                                               //If i = 3, j = 3, k = 1-3, print = 3 stars (***)
            for(int k=1; k<=i; k++){                       // If i = 1, j = 4, k = 1-1, print = 1 star (*)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
