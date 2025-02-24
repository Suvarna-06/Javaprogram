package ex_26_Collection_Framework.List;
import java.util.*;
import java.util.ArrayList;

public class Lab222_ArrayList_95 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("bread");
        list.add("milk");
        list.add("Butter");
        list.add("Jam");
        list.add("Cheeze");
        list.add(678);
        list.add(true);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));

        System.out.println("----- Default for loop");
        for( int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("----- for each loop");
        for(Object o : list) // Object -> it is used which access all type of data
        {
            System.out.println(o);
        }

        System.out.println("----- To print usint iterator");

        // Iterate -> Anchor - go one by one forward -> et access them
        // HasNext -> true - If we have a next element
        // Next -> element

        // Iterator is supported by all
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
