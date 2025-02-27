package ThreadDemo;

public class TH03 {
    public static void main(String[] args) {


        ThreadGroup threadGroup = new ThreadGroup("Worksers");

        WorkerTH03 w1 = new WorkerTH03(threadGroup,"W1");
        w1.start();

        WorkerTH03 w2 = new WorkerTH03(threadGroup,"w2");
        w2.start();
        System.out.println(w1);

    }

    // Thread by Class --->  INTERVIEW QUESTION
    // How to create the thread class

   static class WorkerTH03 extends Thread{

        WorkerTH03(ThreadGroup ThreadGroup,String name){
            super(ThreadGroup,name);
        }

        // How worker3 is created --> by extending a class of thread.
        @Override
        public void run() {
            for (int i = 0; i< 5;i++){
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
            }
        }
    }

}
