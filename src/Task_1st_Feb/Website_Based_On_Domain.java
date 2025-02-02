package Task_1st_Feb;

import java.util.Scanner;

public class Website_Based_On_Domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL:");
        String url=sc.nextLine();
        String website_type ;

        if(url.endsWith(".com")){
            website_type=( "The website type is: Commercial website");

        } else if (url.endsWith(".org")) {
            website_type=("The website type is: Non-profit organization");
        }
        else if (url.endsWith(".edu")){
            website_type=("The website type is: Educational institution");
        }
        else if (url.endsWith(".gov")) {
           website_type=("The website type is: Government website");
        } else if (url.endsWith(".net")) {
            website_type=("The website type is: Network-related website");
        } else if (url.endsWith(".info")) {
            website_type=("The website type is: Informational website");
        } else  {
            website_type=("The website type is: Unknown or other types of websites");
        }
        System.out.println("the website type is:" + website_type);

    }
}
