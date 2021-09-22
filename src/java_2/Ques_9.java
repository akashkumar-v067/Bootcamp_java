package java_2;

public class Ques_9 {
    public static void main(String args[]) {
        furniture x = new WoodenTC();
        furniture y = new MetalTC();
        x.fire_test(50,60);
        x.stress_test(70,75);
        y.fire_test(90,90);
        y.stress_test(45,35);
    }

}
interface furniture{
    public void stress_test(int attr1,int attr2);
    public void fire_test(int attr1,int attr2);
}
class WoodenTC implements furniture{
    @Override
    public void fire_test(int attr1, int attr2) {
      if(attr1>50&&attr2>50){
          System.out.println("stress test score is 95%");
      }
      else{
          System.out.println("stress test score is 60%");
      }
    }

    @Override
    public void stress_test(int attr1, int attr2) {
        if(attr1>50&&attr2>50){
            System.out.println("fire test score is 75%");
        }
        else{
            System.out.println("fire test score is 20%");
        }
    }
}
class MetalTC implements furniture{
    @Override
    public void fire_test(int attr1, int attr2) {
        if(attr1>60&&attr2>60){
            System.out.println("stress test score is 95%");
        }
        else{
            System.out.println("stress test score is 60%");
        }
    }

    @Override
    public void stress_test(int attr1, int attr2) {
        if(attr1>80&&attr2>80){
            System.out.println("fire test score is 75%");
        }
        else{
            System.out.println("fire test score is 20%");
        }
    }
}