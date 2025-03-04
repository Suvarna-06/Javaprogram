package Interview_Programs;

public class Triangle {
    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 5;
        int side3 = 5;

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
