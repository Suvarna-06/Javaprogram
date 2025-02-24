package ex_26_Collection_Framework.List;

import java.util.Stack;

public class Lab229_Stack {
    public static void main(String[] args) {
        // Stack
        //LILO -->Last in First Out
//        Stack s = new Stack();
//        s.add("Sushmita");
//        s.add("Bngalore");
//        System.out.println(s);
//
        Stack s = new Stack();
        s.push("Pramod");
        s.push("Netra");
        s.push("Devraj");
        s.push("prajju");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek() );
        System.out.println(s);
        System.out.println(s.pop());// remove top element
        System.out.println(s.add("Prajju"));

        System.out.println(s);
        System.out.println(s.empty());

        System.out.println(s.get(0));
        System.out.println(s.get(1));










    }
}
