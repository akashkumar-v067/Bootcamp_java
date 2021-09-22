package java_2;

import java.util.*;

public class Ques_2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=s.nextLine();
        char[] arr=str.toCharArray();
        for(int i=1;i< arr.length;i++){
            char key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
      }
    }

}
