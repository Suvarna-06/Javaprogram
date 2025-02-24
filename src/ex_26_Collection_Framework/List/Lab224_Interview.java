package ex_26_Collection_Framework.List;

import java.util.*;

public class Lab224_Interview {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(93);
        marks.add(67);
        marks.add(89);
        marks.add(45);
        System.out.println(marks);

        // We have one class " Collections" to sort
        // Collection -> Interface
        //Collections -> Class(it contains complete methods ehich list,set,queue may requires.
        Collections.sort(marks);
        System.out.println(marks);

        //reverse order
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
