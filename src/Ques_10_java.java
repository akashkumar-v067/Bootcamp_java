/*Q10.Write a single program for following operation using overloading
        A) Adding 2 integer number
        B) Adding 2 double
        C) multiplying 2 float
        D) multiplying 2 int
        E) concate 2 string
        F) Concate 3 String*/

import java.util.*;
public class Ques_10_java {
    public static void main(String args[]){
       Ques_10_java obj= new Ques_10_java();
        System.out.println(obj.add(15,25));
        System.out.println(obj.add(36.9,57.1));
        System.out.println(obj.mul(10,34));
        System.out.println(obj.mul(4.5f,3.5f));
        System.out.println(obj.concat("akash ","sharma"));
        System.out.println(obj.concat("you ","are ","beautiful"));


    }
    public int add (int a, int b){
        int sum;
        sum=a+b;
        return sum;
    }
    public double add (double a, double b){
        double sum;
        sum=a+b;
        return sum;
    }
    public int mul (int a, int b){
        int sum;
        sum=a*b;
        return sum;
    }
    public float mul (float a, float b){
        float sum;
        sum=a*b;
        return sum;
    }
    public String concat(String str1,String str2){
        String str3;
        str3=str1+str2;
        return str3;
    }
    public String concat(String str1,String str2,String str3){
        String str4;
        str4=str1+str2+str3;
        return str4;
    }














}
