package java8;

import java.util.ArrayList;
import java.util.List;

public class Ques_11_java8 {
    static int sum=0;
    static void doubleAdd(int i){
        sum=sum+(i*2);
        //return sum;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=20 ;i++){
            list.add(i);
        }
        list.stream().forEach(Ques_11_java8::doubleAdd);
        System.out.println(sum/ list.size());
    }
}
