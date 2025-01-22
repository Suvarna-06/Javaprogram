package JavaTask;

public class Largest_of_Three_Numbers {
    public static void main(String[] args) {
        int a =34,b=96,c=89;
        int largest_of_three = (a>b)? ((a>c)? a:c):((b>c)? b:c);
        System.out.println(largest_of_three);
    }
}
