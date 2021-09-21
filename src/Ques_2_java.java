//Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
import java.util.*;
public class Ques_2_java {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    String str1=s.nextLine();
    int count;
    String str2="None";
    String words[]=str1.split(" ");
    System.out.println("the duplicate word in string are: ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                    str2="0";
                }
            }
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);

        }
        if(str2=="None"){
            System.out.println("No duplicate words");
        }



    }
}
