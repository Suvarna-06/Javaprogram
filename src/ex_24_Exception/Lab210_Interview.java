package ex_24_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab210_Interview {
    public static void main(String[] args)  throws FileNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream("C://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Yes");
        }
    }

}
