package java_2;

import java.util.Locale;

public class CustomExe extends Exception{
    public CustomExe(String str){
        super(str,null,false,false);
    }
}
class exe_test{
    public static void validate(String s) throws CustomExe{
        if(s!="female"&&s!="f"){
            throw new CustomExe("ONLY FEMALE CANDIDATE REQUIRED");
        }
        else{
            System.out.println("YOU ARE ELIGIBLE TO APPLY");
        }
    }
}
