package Collections;

import java.util.*;

public class Ques_4_coll {
    public static void main(String args[]){
        List<Employee> list=new LinkedList<>();
        list.add(new Employee("Akash",21,35000));
        list.add(new Employee("Shiva",27,15000));
        list.add(new Employee("Vijay",26,5000));
        list.add(new Employee("Pankaj",24,10000));
        list.add(new Employee("Bhavya",22,25000));
        list.add(new Employee("Rajneesh",25,30000));

        Collections.sort(list, new CompareSal());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }



    }
}
class Employee{
   String Name ;
   double Age;
   double Salary;
   Employee(String str, double age, double sal ){
       this.Name=str;
       this.Age=age;
       this.Salary=sal;
   }
    public String toString(){
        return Name+" "+Age+" "+Salary;
    }
}
class CompareSal implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        if(e1.Salary>e2.Salary)
            return -1;
        else if(e1.Salary<e2.Salary)
            return 1;
        else
            return 0;
    }
}