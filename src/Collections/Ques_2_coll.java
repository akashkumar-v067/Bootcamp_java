package Collections;
import java.util.*;
public class Ques_2_coll {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
    String str=s.nextLine();
    char[] arr=str.toCharArray();
    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    for(int i=0;i<arr.length;i++){
        if(charMap.containsKey(arr[i])){
            charMap.put(arr[i],charMap.get(arr[i])+1);
        }
        else{
            charMap.put(arr[i],1);
        }
    }
        System.out.println("The unique character in string: ");
        for(int i=0;i<arr.length;i++) {
            if (charMap.containsKey(arr[i])) {
                if(charMap.get(arr[i])==1){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
