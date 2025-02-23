package ex_25_Generics;

import java.util.Stack;

public class Lab214_G {
    public static void main(String[] args) {
    temp_sum(45,67);
    temp_sum("pramod","Dutta");
    }

    // Method Overloading
    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }

    static  String temp_sum(String a, String b){
        return a + b;
    }

}
