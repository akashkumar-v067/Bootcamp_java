package java_2;
import java.util.*;
public class Cashier {
    static int token=100;
    static Queue<Integer> order= new LinkedList<>();
    public void Payment(boolean p){
    if(p){
        System.out.println("order successful");
        token=token+1;
        order.add(token);
        System.out.println("your token no is:"+token);
    }
    else{
        System.out.println("order failed");
    }

}

}
