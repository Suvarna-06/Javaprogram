package ex_19_OOPs_Part2.superkeyword;

public class Lab170 {
    public static void main(String[]args){
        TestCase1 t1 = new TestCase1("chrome");
        t1.openBrowser();
        System.out.println("Test case T1 running");
        t1.closeBrowser();
        System.out.println(t1.getBrowser());
    }






    }
    class BaseClass{
        private String browser;

        //Parameterised Constructor
        public BaseClass(String browser){
            this.browser = browser;
        }
        // If want to change parameter use getter & setter
        public String getBrowser(){
            return browser;
        }

        public void setBrowser(String browser, boolean isAdmin){
            if(isAdmin){
                this.browser=browser;
            }
            else {
                System.out.println("Change the browser is not allowed ,Not a admin");
            }

        }

        void openBrowser(){
            System.out.println("Opening Browser!!");
        }

        void openBrowser(String browserName){
            System.out.println("Open Browser!! --> "+browserName);
        }

        void closeBrowser(){
            System.out.println("close Browser!!");
        }
    }

    class TestCase1 extends BaseClass{
        public TestCase1(String browser){
            super(browser); // call to my parent constructor
        }

        @Override
        public void setBrowser(String browser, boolean isAdmin) {
            System.out.println("Override the parent set Browser");
        }
    }


