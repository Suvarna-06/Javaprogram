package Task_31_Jan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Electricity_Bill_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units:");
        int units =sc.nextInt();
        double total_cost = 0;

        if(units>=0 && units<=100){
            total_cost = units* 0.50;
        }
        else if(units>=101 && units<=200){
            total_cost =(100*0.50) + ((units - 100)*0.75);
        }
        else if (units>=201 && units<=300){
            total_cost =(100*0.50) + (100*0.75) + ((units - 200)*1.20);
        }
        else{
            total_cost = (100 * 0.50) + (100 * 0.75) +(100 * 1.20) + ((units - 300)*1.50);
        }
        System.out.println("The total cost for"+ units + " units is Rs. " + total_cost);
    }
}
