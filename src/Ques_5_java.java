//Q5. Find common elements between two arrays.
import java.util.Scanner;

public class Ques_5_java {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
       int[] arr1={10,20,30,40,50};
       int[] arr2={10,20,60,70,80,50};
       boolean flag=true;
       System.out.println("The common elements in arrays are: ");
        for(int i=0;i< arr1.length;i++){
           for(int j=0;j< arr2.length;j++){
               if(arr1[i]==arr2[j]){
                   System.out.print(arr1[i]+" ");
                   flag=false;
               }
           }
       }
       if(flag){
           System.out.println("No common element found");
       }


    }
}
