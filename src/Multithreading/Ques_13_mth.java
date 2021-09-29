package Multithreading;

public class Ques_13_mth {
    public static void main(String args[]) throws InterruptedException {
    Mlth_wait1 obj1=new Mlth_wait1();
    Mlth_wait2 obj2=new Mlth_wait2();
    Thread t1=new Thread(obj1);
    Thread t2=new Thread(obj2);
     t1.start();
     t2.start();

    }
}
 class Mlth_wait1 implements Runnable{

     @Override
     public void run() {
         synchronized (this) {
             System.out.println("thread started");
             try {
                 this.wait(1000);
                 Thread.sleep(1000);

             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             notify();
             System.out.println("thread completed");
         }
     }
 }
class Mlth_wait2 implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Second thread");
            notify();
        }
    }
}