package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ques_5_mth {
    public static void main(String args[]){
        ExecutorService Ex= Executors.newFixedThreadPool(2);
        System.out.println(Ex.isTerminated());//print false because Ex not terminated
        System.out.println(Ex.isShutdown());//print false because Ex not shutdown
        Ex.execute(new thr_sh());
        Ex.shutdown();
        System.out.println(Ex.isTerminated());//print false because Ex has a task to complete.
        System.out.println(Ex.isShutdown());//print true as shut down has been called



        try {
            Ex.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
        }
        System.out.println(Ex.isTerminated());//print true because all task completed and Ex terminated.


    }
}
