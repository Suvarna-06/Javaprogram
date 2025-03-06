package Task_5th_March;

public class Private_AccessModifier {
    public static void main(String[] args) {
        Diary d = new Diary();
//
//        d.secretText ="Hello";     // ERROR! Can't access private field
//        d.writeScrete();          // ERROR! Can't call private method

        d.addEntry("My day was great!"); // Must use public method

    }
}

class Diary{
    private String sceterText;    // Only Diary can access

    private void writeScrete(){    // Only Diary class can call
        System.out.println("Writing " + sceterText );
    }

    public void addEntry(String text){
        sceterText =text;
        writeScrete();    // Private method called from inside
    }

}