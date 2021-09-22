package java_2;
import java.util.*;
public class Ques_7 {
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the second: ");
      int second=s.nextInt();
      int days,hours,minutes;
      days=second/86400;
      hours=(second%86400)/3600;
      minutes=((second%86400)%3600)/60;
      second=((second%86400)%3600)%60;
      System.out.print("The no of \n days: "+days+",\n Hours: "+hours+",\n Minutes: "+minutes+"\n and Second: "+second);
    }

}
