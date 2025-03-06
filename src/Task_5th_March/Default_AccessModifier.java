package Task_5th_March;

public class Default_AccessModifier {
    public static void main(String[] args) {
        Friend friend = new Friend();
        friend.name ="Alex";      // Default field is accessible (same package)
        friend.sayHi();          //  Default method is accessible (same package)
    }
}


class Friend{
    String name;                  // default access(no keyword)

    void sayHi(){                // Default access(no keyword)
        System.out.println("Hi, I'm " + name);
    }

}