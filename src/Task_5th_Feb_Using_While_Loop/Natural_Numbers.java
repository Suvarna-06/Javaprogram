package Task_5th_Feb_Using_While_Loop;

public class Natural_Numbers {
    public static void main(String[] args){
        int sum=0;
        int i=1;
        while (i<=10){
            sum+=i;
            i++;
        }
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }



}
