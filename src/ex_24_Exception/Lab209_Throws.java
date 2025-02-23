package ex_24_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab209_Throws {
    // In the framework we avoid the "throws"
    public static void main(String[] args)  throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://abc.txt");
    }
}
