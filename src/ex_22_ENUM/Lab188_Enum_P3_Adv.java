package ex_22_ENUM;

public class Lab188_Enum_P3_Adv {
    public static void main(String[] args) {
        System.out.println(colors.RED.getHexacode());
    }
}

enum colors{
    RED("#FF0000"),
    Green("#00FF00"),
    Blue("#0000FF"),
    Yellow("#FFFF00");


    private String hexacode;
    colors(String hexacode){
        this.hexacode= hexacode;
    }

    String getHexacode(){
        return this.hexacode;
    }
}