package ex_14_Strings;

import java.util.Arrays;

public class Lab123_String_Concept {
    public static void main(String[]args){
        String str1 = "Hello";  // creates or reuses "Hello" in the String constant pool
        String str2 = "Hello"; //  reuses the "Hello" from the String pool
        String str3 = new String("Hello"); // creates a new object on the heap area.

        System.out.println(str1 == str2); // true, both refer to the same object in the string constant pool(pointing to same memory location)
        System.out.println(str1 ==str3); // false, str3 is a new object in the heap area
        System.out.println(str1.equals(str3)); // true, because the content "Hello" is same in the both

        //Practice
        String name ="Sandhya";
        String name2 ="Sandhya Sankeshwar";

        // 1. charAt()
           System.out.println(name.charAt(5)); // returns 'y' that is index[5]

        // 2.concat()
            System.out.println(name.concat("Sankeshwar")); // SandhyaSankeshwar.

        // 3. contains()
            System.out.println(name.contains("Sandhya")); // true

        // 4. equals()
            System.out.println(name.equals("Sandhya")); // Sandhya

        // 5. equalsIgnoreCase()
            System.out.println(name.equalsIgnoreCase("SANDHYA")); // true

        // 6. indexOf()
             System.out.println(name.indexOf('n'));

        // 7. length()
            System.out.println(name.length());

        // 8. replace(,)
            System.out.println(name.replace('n','N')); // SaNdhya

        // 9. split()

            String name4 = "Sandhya Patil";
            String[] split = name4.split(" ");
            System.out.println(Arrays.toString(split));  // [Sandhya, Patil]
            System.out.println(split[0]); // Sandhya
            System.out.println(split[1]); // Patil

        // 10. substring( , )
            System.out.println(name.substring(1,4)); // and

        // 11. toLowerCase()
            System.out.println("SANKESHWAR".toLowerCase());

        // 12. toUpperCase()
            System.out.println("sandhya".toUpperCase());

        // 13. replaceAll()
            System.out.println(name2.replaceAll(" " ,"Kamli"));

        // 14. startsWith()
            System.out.println(name.startsWith("S"));

        // 15. endsWith()
             System.out.println(name.endsWith("a"));

        // 16. isEmpty()
            System.out.println(name.isEmpty());

        // 17. trim()
            String  name3= "    Sandhya Sankeshwar    ";   // Sandhya Sankeshwar
            System.out.println(name3.trim());

        // 18. compareTo()
            System.out.println(name.compareTo("Sandhya"));

        // 19. compareToIgnoreCase()
            System.out.println(name.compareToIgnoreCase("sandhya")); //  method returns 0 if the string is equal to the other string, ignoring case differences.

        // 20. lastIndexOf() --> returns the position of the last occurrence of specified character(s) in a string
            System.out.println(name.lastIndexOf("a"));

        // 21. repeat()
            System.out.println(name.repeat(2));

            StringBuilder stringBuilder= new StringBuilder("Sandhya");
            stringBuilder.append("Patil");
            System.out.println(stringBuilder);

            StringBuilder sb = new StringBuilder("Hi");
            sb.append(" It's my world!");
            System.out.println(sb.toString());

            String s1 = "Hello";
            String s2 = "World";
            String s3 = s1+s2; // creates a new string "Hello World"!
            System.out.println(s3); // output: Hello World!
            System.out.println(s1);









































































    }
}
