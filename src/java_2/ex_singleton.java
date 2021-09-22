package java_2;

public class ex_singleton {
    private static ex_singleton only_obj =null;
    public int x;
    private ex_singleton(){
       x=10;
    }

    public static ex_singleton getObject(){
        if(only_obj==null) {
            only_obj = new ex_singleton();
        }
        return only_obj;
    }
}
