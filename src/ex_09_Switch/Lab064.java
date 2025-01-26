package ex_09_Switch;
import java.util.Scanner;
public class Lab064 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a browser");
        String browser = sc.next();

        switch(browser){
            case "chrome":
                System.out.println("Starting  the chrome");
                System.out.println("...........");
                System.out.println("TC");
                break;
            case "firefox":
                System.out.println("Starting firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "Edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser it is!");






        }

    }
}
