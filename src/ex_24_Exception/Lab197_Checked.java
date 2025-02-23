package ex_24_Exception;

import java.io.FileInputStream;

public class Lab197_Checked {
    public static void main(String[] args) {

        // Checked -> When the JVM knows some of the Exception

        // Checked - JVM
        //JVM knows about it, during compilation - JVM is saying that
        // there can be case when this file is not found.

        // JVM knows that this may lead to file not found exception
        // so it  is telling to handle it.

       // FileInputStream fileInputStream = new FileInputStream("C://log.txt");

    }
}
