package java_2;

public class Ques_10 {
    public static void main(String args[]){
        Customer akash= new Customer();
        Customer shivam= new Customer(true);
        Cashier abc = new Cashier();
        abc.Payment(akash.payment);
        abc.Payment(shivam.payment);
        Barista xyz=new Barista();
        xyz.prepare(true);

    }

}
