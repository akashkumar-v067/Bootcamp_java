package java8;

public class Ques_5_java8 {
    public static void main(String[] args) {
     impEmployee obj=Employee::new;
        System.out.println( obj.get("akash",21,"noida"));

    }
}
class Employee{

    String Name;
    int Age;
    String City;
    Employee(){
        System.out.println("default constructor");
    }
    Employee(String n, int a, String c){
        this.Name=n;
        this.Age=a;
        this.City=c;
    }

    @Override
    public String toString() {
        return "Name: "+this.Name+" Age: "+this.Age+" City: "+this.City;

    }
}

interface impEmployee{
    //Employee get();

    Employee get(String n, int a, String c);

}