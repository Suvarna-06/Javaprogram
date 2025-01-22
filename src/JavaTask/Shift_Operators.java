package JavaTask;

public class Shift_Operators {
    public static void main(String[] args) {
        int num = 8; // 8 in binary is 1000
        System.out.println("num << 1: " + (num << 1)); // Left shift: 16 (10000 in binary)
        System.out.println("num >> 1: " + (num >> 1)); // Right shift: 4 (100 in binary)
        System.out.println("num >>> 1: " + (num >>> 1)); // Unsigned right shift: 4 (100 in binary)

    }
}
