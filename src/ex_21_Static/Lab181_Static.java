package ex_21_Static;

public class Lab181_Static {

    // Static means it is common to all the references.

    public static void main(String[]args){
        Student s1 = new Student(23);
        Student s2 = new Student(33);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course_name);
        Student.m1();
    }
}

 class Student{
    int age; // Non static
     static String course_name = "ATB"; // It is available in the class loader.

     public Student(int age_c){
         this.age = age_c;
     }

     static void m1(){
         System.out.println("I am static");
     }
 }