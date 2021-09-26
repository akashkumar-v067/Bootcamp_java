package Collections;

import java.util.*;

public class Ques_5_coll {
    public static void main(String args[]){
        List<Student> list=new LinkedList<>();
        list.add(new Student("Akash",21,350));
        list.add(new Student("Shiva",27,150));
        list.add(new Student("Vijay",26,500));
        list.add(new Student("Pankaj",24,500));
        list.add(new Student("Bhavya",22,250));
        list.add(new Student("Rajneesh",25,300));

        Collections.sort(list, new CompareSco());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }



    }
}
class Student{
    String Name ;
    double Age;
    double Score;
    Student(String str, double age, double sco ){
        this.Name=str;
        this.Age=age;
        this.Score=sco;
    }
    public String toString(){
        return Name+" "+Age+" "+Score;
    }
}
class CompareSco implements Comparator<Student>{
    public int compare(Student e1, Student e2){
        if(e1.Score>e2.Score)
            return -1;
        else if(e1.Score<e2.Score)
            return 1;
        else
            return e1.Name.compareTo(e2.Name);
    }
}

