package ex_26_Collection_Framework.MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab241_HashTable {
    public static void main(String[] args) {
        // Map -> K,V, null values allows

        // HashTable - Synchronised, Slow and Legacy Class -Thread Safe
        // T1,

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"Two");
        ht1.put(3,"three");
       // ht1.put(null,"three");
       //  ht1.put("five",null);
        System.out.println(ht1);

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());


            HashMap<Integer,String> ht2 = new HashMap();
            ht2.put(1,"one");
            ht2.put(2,"Two");
            ht2.put(null,"three");
            System.out.println(ht2);
        }

    }
}
