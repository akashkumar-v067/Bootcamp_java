import java.util.Scanner;
 import java.util.*;
public class Ques_1_java {
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            System.out.println("enter the String: ");
            String str1=s.nextLine();
            System.out.println("enter the SubString to be replaced: ");
            String str2=s.nextLine();
            System.out.println("enter the new String: ");
            String str3=s.nextLine();
            String str4=str1.replace(str2,str3);
            System.out.println(str4);
   }
}
