package java_2;



public class CustomExe extends Exception{
    public CustomExe(String str){
        super(str,null,false,false);
    }
}
class exe_test{
    public static void validate(String s) throws CustomExe{
        if(s!="female"){
            throw new CustomExe("ONLY FEMALE CANDIDATE REQUIRED");
        }
        else{
            System.out.println("YOU ARE ELIGIBLE TO APPLY");
        }
    }
}
