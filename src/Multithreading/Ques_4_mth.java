package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ques_4_mth {
    public static void main(String args[]){
        ExecutorService Ex= Executors.newFixedThreadPool(2);
        for(int i=0;i<6;i++){
            Ex.execute(new thr_sh());
        }
        Ex.shutdown();
        // shutdown will wait for all thread to be completed.
        // it will not accept new task
        // example:
        // Ex.execute(new thr_sh());
        // will give error
        // it is compulsory to halt ExecutorService in the end

      // Ex.shutdownNow();
        // shutdownNow wait for thread currently executing to be completed.
        // it will not accept thread in waiting queue.
        // it will interrupt sleep() during thread execution and give InterruptedException

    }
}
class thr_sh extends Thread{
    public int id;
    static int count=1;
    @Override
    public void run() {
        System.out.println("Thread no "+id+" starting");

            System.out.println(id+"th Thread running");

            try {
            TimeUnit.MILLISECONDS.sleep(1000);
             } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("Thread completed: "+id+"th ONE");
    }
    thr_sh(){
        this.id=count++;
    }
}