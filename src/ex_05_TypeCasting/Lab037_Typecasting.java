package ex_05_TypeCasting;

public class Lab037_Typecasting {
    public static void main(String[] args) {
        long phone_no = 9845678489l;
        // short s = phone_no; // implicit?
        short s = (short)phone_no;// explicit?
    }
}
