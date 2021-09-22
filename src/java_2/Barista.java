package java_2;

public class Barista {
        int x = Cashier.order.peek();
        public void prepare(boolean coffee){
        if(coffee){
         System.out.println("Coffee prepared for token no:"+x);
         Cashier.order.remove();
     }
     else{
         System.out.println("Wait for 15 minutes");

     }
    }

}
