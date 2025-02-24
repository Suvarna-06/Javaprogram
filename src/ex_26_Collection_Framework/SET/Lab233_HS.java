package ex_26_Collection_Framework.SET;

import java.util.HashSet;

public class Lab233_HS {
    public static void main(String[] args) {
        HashSet<String > set = new HashSet<>();
        set.add("Orange");
        set.add("Pumpkin");
        set.add("pineapple");
        set.add("Banana");
        set.add("Banana");
        System.out.println("Set elements: " + set);
    }
}
