package ex_22_ENUM;

public class LAb189_Enum_P1 {

    public static void main(String[] args) {
            System.out.println(Locaters.page_button.getLocater());
        }
    }
    enum Locaters{
        page_button("#btn"),
        page_input("#input1");

        private String locater;

        Locaters (String locater){
            this.locater = locater;
        }

        String getLocater (){
            return this.locater;
        }
    }
