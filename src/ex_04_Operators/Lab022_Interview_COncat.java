package ex_04_Operators;

public class Lab022_Interview_COncat {
    public static void main(String[] args) {
        String name1="Pramod";
        String name2="Dutta";
        int a = 10;
        int b = 10;
        // How many variables = 4
        // How many Literals = 2(int,String)

        System.out.println(name1 + name2 + a + b);
        // first operator -> after concatination is performed

        System.out.println(a + b + name1 + name2);
        // First + math

        System.out.println(name1 + name2 + (a + b));
    }
}
