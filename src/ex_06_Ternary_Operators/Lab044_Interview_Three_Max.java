package ex_06_Ternary_Operators;

public class Lab044_Interview_Three_Max {
    public static void main(String[] args) {
        // Finding the largest number n1, n2,n3 => max(n1,n2,n3)

        // Step 1 : Find the inputs and outputs
        // n1,n2,n3 -> data type -> int
        // o/p -> int
        // 23,34,10 -> 34 (ask the output to the interviewer)

        // Step 2 : rough logic
        // n1 >= n2 -> Y1 : N1
        // Y1 ->  n1 >= n3 : Y(n1): N (n3)
        // N1 -> n2 >n3 : Y (n2) : N (n3)

        int n1 = 2, n2 = 9, n3 = -11;
        int largest = (n1 > n2)? ((n1 > n3)? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest: " + largest);



    }
}
