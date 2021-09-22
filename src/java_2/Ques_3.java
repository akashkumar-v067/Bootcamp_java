package java_2;
import java.util.*;
public class Ques_3 {
 public static void main(String args[]){

  try{
   demo obj=new demo();
  }
  catch(Throwable e){
   System.out.print(e);
  }
  demo obj2=new demo();
 }
 test obj3=new test();
}
class demo{
  static  int i=1/0;
}