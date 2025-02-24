package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab218 {
    public static void main(String[] args) {
       // ArrayList ->  Which is complete list, ArrayList is a Class
        // which implements the List, now all the methd are implemeted of the list.

        ArrayList arrayList = new ArrayList();
        arrayList.add("Sandhya");
        arrayList.add("Sankeshwar");
        arrayList.add(null);
        arrayList.add("Suvarna");
        arrayList.add(123); // Different data type can be allowed.
        arrayList.add("Sandhya"); // Duplicates are allowed.

        System.out.println(arrayList);

        System.out.println(arrayList.size());


        // We can have  parent reference
        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("345");
    }
}
