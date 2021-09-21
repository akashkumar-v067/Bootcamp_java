//Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
public class Ques_7_java {
    public static void main(String args[]){
        System.out.println("Using static method: ");
        Ques_7_java.Mydetails();
        System.out.println("Using static variable: ");
        System.out.println("FirstName: "+FirstName+"LastName: "+LastName+"Age: "+Age);


    }
    public static void Mydetails(){
        String FirstName="Akash";
        String LastName="Kumar";
        int Age=21;
        System.out.println("FirstName: "+FirstName+"LastName: "+LastName+"Age: "+Age);
    }
    static {
        String FirstName="Akash";
        String LastName="Kumar";
        int Age=21;
        System.out.println("Using static Block: ");
        System.out.println("FirstName: "+FirstName+"LastName: "+LastName+"Age: "+Age);
    }
    static String FirstName="Akash";
    static String LastName="Kumar";
    static int Age=21;

}
