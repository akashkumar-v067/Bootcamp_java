package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ques_3_mth {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        thr_sh obj1 = new thr_sh();
        thr_sh obj2 = new thr_sh();
        executor.submit(obj1);
        executor.submit(obj2);
        executor.shutdown();
    }
}

