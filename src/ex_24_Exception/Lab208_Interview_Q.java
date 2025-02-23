package ex_24_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab208_Interview_Q {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("C://ab.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
