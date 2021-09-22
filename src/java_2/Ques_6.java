package java_2;

public class Ques_6 {
public static void main(String args[]){
    try{
        int[] arr=new int[10];
        arr[11]=25/25;
    }
    catch (ArrayIndexOutOfBoundsException ex){
        System.out.println(ex);
    }
    catch (ArithmeticException e){
        System.out.println(e);
    }
    finally{
       System.out.println("finally block");
    }
}
}
