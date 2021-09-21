//Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
import java.util.Scanner;

public class Ques_8_java {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuffer str =new StringBuffer(s.nextLine());
        str=str.reverse().replace(4,9,"");
        System.out.print(str);

    }
}
