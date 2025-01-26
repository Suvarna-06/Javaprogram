package ex_13_Functions;

public class Lab106_Ex4 {
    public static void main(String[] args) {
        // 4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_two_numbers(190,900);
        int sum3 = sum_of_two_numbers(2345,5432);
        int sum4 = sum_of_three_numbers(2345,5432, 5432);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

        int result = Math.max(3,4); // 4th Type
    }


    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sum_of_three_numbers(int a, int b,int c){
        return a+b+c;
    }
}
