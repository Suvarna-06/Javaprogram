package Task_30th_Jan;

public class Smallest_Of_Three {
    public static void main(String[] args) {
        int a = -20, b = -599, c = 31;
        if (a<b && a<c){
            System.out.println(a+ " is smallest");
        }
        else if (b<a && b<c){
            System.out.println(b+ " is smallest");
        }
        else{
            System.out.println(c+ " is smallest");
        }
    }
}
