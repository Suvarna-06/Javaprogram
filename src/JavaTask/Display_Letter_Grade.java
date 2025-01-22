package JavaTask;

public class Display_Letter_Grade {
    public static void main(String[] args) {
        int marks = 84;
        String result = ((marks >= 90 && marks <=100)? "A" :(marks>= 80 && marks<=89)?  "B" :(marks >= 70 && marks<=79)? "C":(marks>=60 && marks<=69)? "D":(marks>=0 && marks <= 59)?"F":"Invalid");
        System.out.println(result);
    }
}
