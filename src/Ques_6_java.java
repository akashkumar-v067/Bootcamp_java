//Q6. There is an array with every element repeated twice except one. Find that element
import java.util.*;

public class Ques_6_java {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] arr1={10,10,20,30,40,70,40,50,50,20,60,60,80,70,80};
        Arrays.sort(arr1);
        boolean flag=true;
        for(int i=0;i<arr1.length-1;i=i+2){
            if(arr1[i]!=arr1[i+1]){
                System.out.println("The element is: "+arr1[i]);
                flag=false;
                break;
            }

        }
        if(flag){
            System.out.print("The element is: "+arr1[arr1.length-1]);
        }

    }
}
