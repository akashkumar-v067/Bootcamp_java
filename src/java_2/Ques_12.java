package java_2;

public class Ques_12 {
    public static void main(String args[]) {
        Child c = new Child();
    }

}
class Parent extends Grandparent {
          {
          System.out.println("instance - parent");
          }

public Parent() {
        System.out.println("constructor - parent");
        }

static {
        System.out.println("static - parent");
        }
        }

class Grandparent {

    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("constructor - child");
    }

    static {
        System.out.println("static - child");
    }

    {
        System.out.println("instance - child");
    }
}
/*
* flow of program when we make child object:
* 1:it check the extends and goes to parent class.
* 2:on parent again goes for grandparent class (because of extends).
* 3:grandparent class not inheriting any class so it will load.
* 4:the static block of grandparent class load and run;
* 5:after loading grandparent class it will load parent and child class respectively
* so static block of parent and child class will execute;
* 6:now anonymous block of Grandparent class run after that constructor will run
* 7:and same goes for parent and child class respectively.
* the output will be:
*
static - grandparent
static - parent
static - child
instance - grandparent
constructor - grandparent
instance - parent
constructor - parent
instance - child
constructor - child
*
*
*
*
*
*
*
*
*
*
*
*
* */