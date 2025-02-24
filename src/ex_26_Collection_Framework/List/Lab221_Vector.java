package ex_26_Collection_Framework.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab221_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // Similar like array
        v.add("Pramod");
        v.add("Lucky");
        v.add("Testing");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));
        System.out.println(v);


        Iterator iterator =v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----Enumeration----");
        //  Extra Enumeration
        Enumeration<String>enumeration = v.elements();
        while ((enumeration.hasMoreElements())){
            System.out.println(enumeration.nextElement());
        }

    }
}
