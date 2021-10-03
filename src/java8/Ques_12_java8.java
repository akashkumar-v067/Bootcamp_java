package java8;

import java.util.ArrayList;
import java.util.List;

public class Ques_12_java8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(258);
        list.add(252);
        list.add(2534);
        list.add(2516);
        list.add(2562);
        list.add(254);
        list.add(64);

        System.out.println(list.stream()
                .sorted()
                .filter(i->i>3&&i%2==0)
                .findFirst());




    }
}
