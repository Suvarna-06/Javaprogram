package JavaTask;

public class Bitwise_Operators {
    public static void main(String[] args) {
        int m = 6, n = 4; // 6 in binary is 110, 4 in binary is 100
        System.out.println("m & n: " + (m & n)); // Bitwise AND: 4 (100 in binary)
        System.out.println("m | n: " + (m | n)); // Bitwise OR: 6 (110 in binary)
        System.out.println("m ^ n: " + (m ^ n)); // Bitwise XOR: 2 (010 in binary)
        System.out.println("~m: " + (~m));      // Bitwise NOT: -7 (complement of 6)

    }
}
