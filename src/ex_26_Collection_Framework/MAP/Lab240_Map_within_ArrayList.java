package ex_26_Collection_Framework.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab240_Map_within_ArrayList {
    public static void main(String[] args) {
        Map<String,String> student1 = new HashMap();
        student1.put("name","Sandhya");
        student1.put("rollno","1");
        student1.put("phone","865733424");
        System.out.println(student1);


        Map<String,String> student2 = new HashMap();
        student2.put("name","Suvarna");
        student2.put("rollno","6");
        student2.put("phone","9785564");
        System.out.println(student2);


        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        // List of Map
        // [{phone=96543210, name=pramod, roll=1}, {phone=65432356, name=amit, roll=2}]

        // JSON
        // [{"phone":96543210, "name":pramod, "roll":1}, {"phone":65432356, "name":amit, "roll":2}]


    }
}
