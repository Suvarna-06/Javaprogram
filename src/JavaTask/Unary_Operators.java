package JavaTask;

public class Unary_Operators {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + (x++)); // Post-increment: 10 (value used, then incremented)
        System.out.println("++x = " + (++x)); // Pre-increment: 12 (incremented, then used)
        System.out.println("x-- = " + (x--)); // Post-decrement: 12 (value used, then decremented)
        System.out.println("--x = " + (--x)); // Pre-decrement: 10 (decremented, then used)

    }
}
