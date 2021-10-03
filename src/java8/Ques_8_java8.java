package java8;

public class Ques_8_java8 implements q8_1,q8_2{
    public static void main(String[] args) {
     Ques_8_java8 obj =new Ques_8_java8();
     //default method overridden
     obj.show();


    }

    @Override
    public void show() {
        System.out.println("main method show content");
    }
}

interface q8_1{
   default void show(){
       System.out.println("interface q8_1 show method content");
   }
}

interface q8_2{
    default void show(){
        System.out.println("interface q8_2 show method content");
    }
}