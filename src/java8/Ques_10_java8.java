package java8;

import java.util.ArrayList;
import java.util.List;

public class Ques_10_java8 {
    static int sum=0;
    static int add(int i){
        sum=sum+i;
        return sum;

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=20 ;i++){
            list.add(i);
        }
        list.stream().filter(i->i>5).forEach(Ques_10_java8::add);
        System.out.println(sum);
    }
}
