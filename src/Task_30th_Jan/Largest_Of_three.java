package Task_30th_Jan;

public class Largest_Of_three {
    public static void main(String[] args) {
        int a = 4, b = 6, c = -210;
        if(a>b && a>c){
            System.out.println(a+ " is largest");
        } else if (b>a && b>c) {
            System.out.println(b+ " is largest");

        }
        else {
            System.out.println(c+ " is largest");
        }
    }
}
