package JavaTask;

public class CLI_Task2_Max_Of_Two_Number {
    public static void main(String[] args) {
        String num1_String = args[0];
        int num1= Integer.parseInt(num1_String);
        String num2_String = args[1];
        int num2 = Integer.parseInt(num2_String);
        int result = ((num1>num2)? num1:num2);
        System.out.println(result);
    }
}
