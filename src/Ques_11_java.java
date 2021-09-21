//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
import java.util.Scanner;
interface Bank{
public void getDetails();

}
class SBI implements Bank{
    String Name="State bank of India";
    String Location="Greater Noida";
    int rateOfInterest=6;
public void getDetails(){
System.out.println("Bank Name: "+this.Name);
    System.out.println("Bank Location: "+this.Location);
    System.out.println("Rate of Interest: "+this.rateOfInterest);
}
}
class ICICI implements Bank{
    String Name="ICICI Bank";
    String Location="Delhi";
    int rateOfInterest=12;
    public void getDetails(){
        System.out.println("Bank Name: "+this.Name);
        System.out.println("Bank Location: "+this.Location);
        System.out.println("Rate of Interest: "+this.rateOfInterest);
    }
}
class BOI implements Bank{
    String Name="Bank of India";
    String Location="Aligarh";
    int rateOfInterest=10;
    public void getDetails(){
        System.out.println("Bank Name: "+this.Name);
        System.out.println("Bank Location: "+this.Location);
        System.out.println("Rate of Interest: "+this.rateOfInterest);
    }
}
public class Ques_11_java {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Bank obj1= new BOI();
        Bank obj2=new SBI();
        Bank obj3=new ICICI();
        System.out.println("\nDetails of BOI: ");
        obj1.getDetails();
        System.out.println("\nDetails of SBI: ");
        obj2.getDetails();
        System.out.println("\nDetails of ICICI: ");
        obj3.getDetails();

    }
}
