package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab235_Map_P1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // Map -> Key - Value pair
        // name:Sandhya
        // rollno : 23
        m1.put("name","Sandhya");
        m1.put("rollno",1);
        m1.put("phone",865733421);
        System.out.println(m1);

        System.out.println("---Using LinkedHashMap-----");
        Map m2 = new LinkedHashMap();
        m2.put("name","Sandhya");
        m2.put("rollno",1);
        m2.put("phone",865733421);
        System.out.println(m2);

        System.out.println("---Using TreeMap-----");

        Map m3 = new TreeMap();
        m3.put("name","Sandhya");
        m3.put("rollno",1);
        m3.put("phone",865733421);
        System.out.println(m3);
    }
}
