package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab238_Map_Real {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("name","Deepali");
        student1.put("phone",837448902);
        student1.put("address","Bangalore");

        System.out.println(student1);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dada Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atmoic Habit");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);








    }
}
