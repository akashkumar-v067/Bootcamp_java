package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques_7_coll {
    public static void main(String args[]){


    }
}

class SpecialStack{
    static int size=10;
    static int top=-1;
    List<Integer> list=new ArrayList<>();
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if (top==size-1)
            return true;
        else
            return false;
    }

    public void push(int x)
    {
        if (isFull())
            System.out.println("stack is full");
        else {
            top++;
            list.add(top,x);
            System.out.println(x+" is added to the stack");
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Already empty");
        }
        else{
            System.out.println(list.get(top)+" has been removed");
            list.remove(top);
            top--;
        }

    }
    public int minElement(){
        Collections.sort(list);
        return list.get(0);
    }

    public void menu(){

    }














}
