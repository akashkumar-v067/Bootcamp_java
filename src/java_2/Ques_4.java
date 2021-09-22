package java_2;

public class Ques_4 {
public static void main(String args[]) {
    ex_singleton x=ex_singleton.getObject();
    ex_singleton y=ex_singleton.getObject();
    ex_singleton z=ex_singleton.getObject();
    System.out.println("hashcode of \nx: "+x.hashCode()+"\ny: "+y.hashCode()+"\nz: "+z.hashCode());
}

}
