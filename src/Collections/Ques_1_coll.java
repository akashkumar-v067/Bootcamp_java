package Collections;
import java.util.*;
public class Ques_1_coll {
    public static void main(String args[]){
        List<Float> list=new LinkedList<>();
        list.add(69.5f);
        list.add(72.6f);
        list.add(86.7f);
        list.add(13.8f);
        list.add(49.4f);
        ListIterator<Float> listIterator = list.listIterator();
        float sum=0;
        while (listIterator.hasNext()) {
            sum=sum+listIterator.next();

        }
        System.out.println(sum);

    }
}
