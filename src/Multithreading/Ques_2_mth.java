package Multithreading;

public class Ques_2_mth {
    public static void main(String args[]){
        Thread t1 = new Thread(new sleepEx());
        Thread t2 = new Thread(new sleepEx());
         t1.start();
         t2.start();

        System.out.println("\nJoining after 1000"+ " milliseconds: \n");
         try {
            t2.join(100);
         }
         catch (Exception e){
             System.out.println(e);
         }


        System.out.println("Current thread: " + t1.getName());

    }
}
class sleepEx implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println(t.getName() + "  " + i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Is Alive? " + t.isAlive());
    }
}
class sleepEx2 implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println(t.getName() + "  " + i);
        }
        System.out.println("Is Alive? " + t.isAlive());
    }
}