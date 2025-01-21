package ex_06_Ternary_Operators;

public class Lab041_Interview_QA {
    public static void main(String[] args) {
        //Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3)

        int number = 15;
        String result = (number > 10) ? (number >20 ? "G > 20": "B 10 to 20"): "B";
        System.out.println(result);

    }
}
