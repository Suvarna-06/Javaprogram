package JavaTask;
import java.util.Scanner;
public class Character_Vowel_Consonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println(ch+ " is vowel.");
        } else if ((ch>='a' && ch<='z') || (ch>='A' && ch=='Z')) {
            System.out.println(ch+ " is consonant.");
            
        }else {
            System.out.println(ch+ "Not a alphabetic character");
        }
    }
}
