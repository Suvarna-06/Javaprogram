package ex_26_Collection_Framework.List;
import  java.util.List;
public class Lab217_List {
    public static void main(String[] args) {

        // we cannot because list is a interface ,
        // where we cannot create the object.
        List l = List.of("Orange","apple","Banana","Mango");
        // static methd can be fully implemented in Interface
        // Default methd - can full implemented in Interface.

        l.add("Cherry"); // java.lang.UnsupportedOperationException
        // add() function is incomplete in the list.
        // But of() is complete bcz of static

        //we cannot add the extra items in the list


    }

}
