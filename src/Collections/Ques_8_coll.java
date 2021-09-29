package Collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques_8_coll {
    public static void main(String args[]){
        Date date=new Date((100)+16,(-1)+03,21);
        SimpleDateFormat obj=new SimpleDateFormat("dd-MMMMMMMMM-YYYY");
        System.out.println(obj.format(date));
    }
}
