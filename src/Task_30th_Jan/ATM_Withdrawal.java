package Task_30th_Jan;

import java.util.Scanner;

public class ATM_Withdrawal {
    public static void main(String[] args) {
        int account_balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be withdraw:");
        int withdraw_amount = sc.nextInt();

        if(withdraw_amount<=0){
            System.out.println("Enter a valid amount greater than zero.");
        } else if (withdraw_amount % 100 !=0) {
            System.out.println("The amount should be multiple of 100.");
        } else if (withdraw_amount > account_balance) {
            System.out.println("Insufficant balance.");
        }
        else{
            account_balance -= withdraw_amount;
            System.out.println("Withdraw successful. Your account balance is Rs." +account_balance);
        }
    }
}
