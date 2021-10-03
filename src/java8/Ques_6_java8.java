package java8;

public class Ques_6_java8 implements q6{
    public static void main(String[] args) {
        Ques_6_java8 obj=new Ques_6_java8();
        //default method call
        System.out.println(obj.f2());
        //static method call
        System.out.println(q6.f1());
    }
}

interface q6{

    static String f1(){
        String str="static method of interface called";
        return str;
    }
    public default String f2(){
        String str="default method of interface called";
        return str;
    }
}
