package ex_22_ENUM;

public class Lab190 {
    public static void main(String[] args) {
        System.out.println(APIURLS.Katalon.getUrl());
    }
}
enum APIURLS{
    Katalon("https://Katalon.com"),
    google("https://google.com");

    private String url;

    APIURLS(String url){
        this.url = url;
    }

    String getUrl (){
        return this.url;
    }
}

