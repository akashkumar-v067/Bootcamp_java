package Collections;
import java.util.*;
public class Ques_6_coll {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=s.nextInt();
        System.out.println("Enter the array: ");
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= s.nextInt();
        }
        TreeMap<Integer,Integer> arrMap=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(arrMap.containsKey(arr[i])){
                arrMap.put(arr[i],arrMap.get(arr[i])+1);
            }
            else{
                arrMap.put(arr[i],1);
            }
        }
        System.out.println("Before soretd: ");
        System.out.println(arrMap);
        System.out.println("After sorted: ");
        System.out.println(entriesSortedByValues(arrMap));

    }



    static <K,V extends Comparable<? super V>>
    SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
                new Comparator<Map.Entry<K,V>>() {
                    @Override
                    public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
