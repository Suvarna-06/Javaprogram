package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab223_Nested_ArrayList {
    public static void main(String[] args) {
//        List<String> l = new ArrayList();
//      // l.add(123);//
//        l.add("Pramod");

        List <String> fruits1 = new ArrayList();
        fruits1.add("Orange");
        fruits1.add("Cherry");
       //  fruits1.add(1233);
        System.out.println(fruits1);

        List <String> fruits2 = new ArrayList();
        fruits2.add("Apple");
        fruits2.add("Mango");
        System.out.println(fruits2);

        List <String> vegetables = new ArrayList();
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Carrot");
        System.out.println(vegetables);

        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegetables);
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(2));


    }
}
