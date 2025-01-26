package ex_13_Functions;

public class Lab102 {
    public static void main(String[] args) {
        // 2.Without Parameters but With Return Type
        int age_to_vote_person= age_to_vote();
        System.out.println("Age to vote is -> " +age_to_vote_person);

    }
    static int age_to_vote(){
        return 18;
    }
}
