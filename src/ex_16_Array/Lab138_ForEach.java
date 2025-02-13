package ex_16_Array;

public class Lab138_ForEach {
    public static void main(String[]args){
        int[] a = new int[3];
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;

        for(int i : a){
            System.out.println(i);
        }

        String [] names ={"Shiva","Hanuman","Ram","Sita","Sandhya"};

        for(String name : names){
            System.out.println(name);
        }
    }
}
