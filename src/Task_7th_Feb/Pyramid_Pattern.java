package Task_7th_Feb;

public class Pyramid_Pattern {
    public static void main(String[]args){
        int n = 9;
         for(int i=1;i<=n;i+=2){                  // If i = 1, j = 0, k = 1, print = 1 star (*)
             //Inner Loop print the spaces     // If i = 3, j = 1, k = 1-3, print = 3 stars (***)
             for(int j=1;j<=(n-i)/2;j++){      // If i = 5, j = 2, k = 1-5, print = 5 stars (*****)
                 System.out.print("");        // If i = 7, j = 3, k = 1-7, print = 7 stars (*******)
             }                               // If i = 9, j = 4, k = 1-9, print = 9 stars (*********)
             //Loop print the '*'
             for(int k=1;k<=i;k++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
