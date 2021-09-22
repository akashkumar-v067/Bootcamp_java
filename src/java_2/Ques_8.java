package java_2;

import java.util.Scanner;

public class Ques_8 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str="";
        String str1="";
        do{
        str1=s.next();
        if(!str1.equals("done"))
          str=str+" "+str1;
        }
        while (!str1.equals("done"));
        System.out.println(str);

    }

}
