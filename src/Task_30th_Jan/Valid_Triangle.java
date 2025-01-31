package Task_30th_Jan;

import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int side1 = sc.nextInt();
        System.out.println("Enter value of b:");
        int side2 = sc.nextInt();
        System.out.println("Enter value of c:");
        int side3 = sc.nextInt();

        if( side1+side2 > side3 && side1+side3 > side2 && side2+side3 > side1){
            System.out.println("is a valid triangle ");
        }
        else {
            System.out.println("Not a valid triangle");
        }
    }
}
