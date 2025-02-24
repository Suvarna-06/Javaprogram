package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab300_ArrayList_Class_element {
    public static void main(String[] args) {
        Student s1 = new Student("Anjusha","2");
        Student s2 = new Student("Rajeshwari","5");

        List<Student> myStudents = new ArrayList(); // student has become a customn data type
        myStudents.add(s1);
        myStudents.add(s2);
        System.out.println(myStudents);

        // Also print using
        s1.printDetails();
        s2.printDetails();

    }
}
