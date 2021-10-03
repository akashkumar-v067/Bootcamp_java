package java8;

import java.util.ArrayList;
import java.util.*;

public class Ques_9_java8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=20 ;i++){
         list.add(i);

        }
        list.stream()
                .filter((i)->i%2==0)
                .forEach(System.out::println);

    }


}
