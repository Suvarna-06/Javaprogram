package Atb_Generic_Demo;

public class MaxThreeNumber {





    public static void main(String[] args) {

        int maxput =maxinumberOf(23,45,67);
        System.out.println(maxput);


    }


    public static int maxinumberOf(int a, int b, int c){
        int max =a;
        if(b>max){
            max =b;
        }
        if(c>max){
            max =c;
        }
    return  max;

    }


    public static double maxinumberOf(double a, double b, double c){
       double max =a;
        if(b>max){
            max =b;
        }
        if(c>max){
            max =c;
        }
        return  max;

    }

    public static String  maxinumberOf(String x, String y, String z){
        String max =x;
        if(y.compareTo(max)>0){
            max =y;
        }
        if(z.compareTo(max)>0){
            max =z;
        }
        return  max;

    }

}

