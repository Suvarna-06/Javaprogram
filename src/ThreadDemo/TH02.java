package ThreadDemo;

public class TH02 {
    public static void main(String[] args) {

        // Thread is --> Class
        //currentThread mthd -->static  native method
        // Native means coming from another third party.
        Thread t =  Thread.currentThread();
        for(int i =0; i<10; i++){
            System.out.println(t.getName() + i + " - " +t.getThreadGroup() +" - " +t.getPriority());
        }




    }



}
