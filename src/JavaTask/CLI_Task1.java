package JavaTask;

public class CLI_Task1 {
    public static void main(String[] args) {
        String name = args[0];
        String age_String = args[1];
        int age = Integer.parseInt(age_String);
        String salary = args[2];
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
