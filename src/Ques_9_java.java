//Q9.Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
public class Ques_9_java {
    public static void main(String args[]){
        House h[]= House.values();//Constructor will call for every value
        //print using values and getPrice method
        for(House i:h){
             System.out.println("House Name: "+i+" Price: "+i.getPrice()+" Millon USD");
         }
    }
    enum House{
        ANTILIA(500),
        JANNAT(300),
        MANNAT(200),
        BURJKHALIFA(100),
        BUCKINGAMPALACE(100);
        int price;
        House(int p){
            System.out.println("constructor called, the value is: "+this.toString());
            price=p;
        }
        int getPrice() {
            return price;
        }
    }
}
