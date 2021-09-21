//Q4. Calculate the number & Percentage Of
//     Lowercase Letters,
//     Uppercase Letters,
//     Digits And Other Special Characters In A String.

import java.util.Scanner;

public class Ques_4_java {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=s.nextLine();
        int m=str.length();
        int LC=0,UC=0,Digit=0,SpChar=0;
        for(int i=0;i<str.length();i++){
            int k=(int)str.charAt(i);
         if(k>96&&k<123){
           LC++;
         }
         else if(k>64&&k<91){
          UC++;
         }
         else if(k>47&&k<58){
          Digit++;
         }
         else{
             if(k!=32)
               SpChar++;
         }

        }
        System.out.println("Percentage of Lower case: "+ ((LC*100)/m)+"%");
        System.out.println("Percentage of Upper case: "+ ((UC*100)/m)+"%");
        System.out.println("Percentage of Digits: "+ ((Digit*100)/m)+"%");
        System.out.println("Percentage of Special Character: "+ ((SpChar*100)/m)+"%");


    }
}
