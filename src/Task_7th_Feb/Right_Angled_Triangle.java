package Task_7th_Feb;

public class Right_Angled_Triangle {
   public static void main(String[]args){
       int n=5;
       //This is outer loop
       for(int i =1;i<=n;i++){                   // First row (i=1) -->Print 1 star
           // This is inner loop                 // First row (i=2) -->Print 2 star
           for(int j=1;j<=i;j++){                // First row (i=3) -->Print 3 star
               System.out.print("* ");          // First row (i=4) -->Print 4 star
           }                                    // First row (i=5) -->Print 5 star
           System.out.println();
       }
   }
}
