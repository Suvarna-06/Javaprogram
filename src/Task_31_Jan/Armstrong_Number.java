package Task_31_Jan;

public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 1999;
        int orginal_num = num;
        int sum = 0;
        int temp = num;


        int digit = 0;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }
        temp = num;

        while (temp != 0) {
            int last_digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digit; i++) {
                power *= last_digit;
            }
            sum += power;
            temp = temp / 10;
        }
        if (sum == orginal_num) {
            System.out.println(orginal_num + " is an Armstrong number.");
        } else {
            System.out.println(orginal_num + " is not a Armstrong number.");
        }
    }
}
