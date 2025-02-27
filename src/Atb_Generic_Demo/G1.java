package Atb_Generic_Demo;

public class G1 {

    public static void main(String[] args) {
        temp(23);
        temp(34.7);
        temp('a');
        temp("SandhHYA");
    }

    public static <T> void temp(T a){
        System.out.println(a);
    }

}

