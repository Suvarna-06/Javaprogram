package ex_26_Collection_Framework.SET;

import java.util.*;
import java.util.Set;

public class Lab232_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element, there's no order maintained
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
       // hs.add(123);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        System.out.println("============");

        Set lhs = new LinkedHashSet();
        // Linkedlist mechansim to store the elemnts,
        // order will be maintained
        lhs.add("Grapes");
        lhs.add("Gava");
        lhs.add("Karbuja");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.size());

        System.out.println("==============");

        Set ts = new TreeSet();
        // Black and Red tree mechanism to store the element.
        // sorting is done on first letter
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Watermelon");
       // ts.add(123); //java.lang.ClassCastException
        //ts.add(null);// java.lang.NullPointerException
        System.out.println(ts);

        System.out.println("-------For each loop-------");
        for(Object o : ts){
            System.out.println(o);
        }



    }
}
