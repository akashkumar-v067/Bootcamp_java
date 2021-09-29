package Multithreading;

public class Ques_1_mth {
    public static void main(String args[]) {
        ex1_thread th1=new ex1_thread();
        ex2_thread t2=new ex2_thread();
        Thread t1= new Thread(th1);
        t1.start();
        t2.start();
    }
}
class ex1_thread implements Runnable{
    public void run(){
        System.out.println("Thread created using Runnable interface");
    }
}
class ex2_thread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread created Using Thread class");
    }
}

