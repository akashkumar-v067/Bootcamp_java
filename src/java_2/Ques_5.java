package java_2;
//yet to complete
import java.lang.Object;
public class Ques_5 {
  public static void main(String args[]) throws CloneNotSupportedException{
  student obj1=new student(123,"akash");

   student obj2 = (student) obj1.clone();
   student obj3=new student(obj1);
    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);


  }

}
class student implements Cloneable{
  int id;
  String Name;
  student(){

  }

  student(student s){
   this.id=s.id;
   this.Name=s.Name;
  }

  student(int i,String s){
    this.id=i;
    this.Name=s;
  }

  @Override
  public String toString() {
    return "id= " + this.id + ", Name= " + this.Name+", " +
            "hascode: "+this.hashCode();
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    student s=new student();
    s.id=this.id;
    s.Name=this.Name;
    return s;
  }
}
