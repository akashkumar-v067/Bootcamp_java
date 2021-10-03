package java8;

public class Ques_2_java8 implements int2{
    public static void main(String[] args) {
        Ques_2_java8 obj =new Ques_2_java8() {
        };

        System.out.println(obj.sum(15,25));
    }
}

interface int2{
    default int sum(int x, int y){
        int sum=x+y;
        return sum;
    };
}
