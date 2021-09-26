package Collections;
import java.util.*;
import java.text.*;
public class Ques_9_coll {
    public static void main(String args[]){
        Date d1 = new Date();

        Locale locIndia = new Locale("hi", "in");
        DateFormat di = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        System.out.println("India Format(Hindi): " + di.format(d1));

        Locale locEng = new Locale("en", "uk");
        DateFormat de = DateFormat.getDateInstance(DateFormat.FULL, locEng);
        System.out.println("England Format: " + de.format(d1));

        Locale locRussian = new Locale("ru", "russia");
        DateFormat dr = DateFormat.getDateInstance(DateFormat.FULL, locRussian);
        System.out.println("Russian Format: " + dr.format(d1));

        Locale locFrench = new Locale("fr", "france");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locFrench);
        System.out.println("French Format: " + df.format(d1));

        Locale locSpanish = new Locale("es", "spain");
        DateFormat ds = DateFormat.getDateInstance(DateFormat.FULL, locSpanish);
        System.out.println("Spanish Format: " + ds.format(d1));


    }
}
