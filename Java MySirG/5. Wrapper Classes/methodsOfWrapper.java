import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class methodsOfWrapper {
    public static void main(String[] args) {

//        valueOf()
//          -> static method
//          -> return OBJECT REFERENCE of relative wrapper class
        Integer it=Integer.valueOf("123");
        Double du=Double.valueOf("3.14");
        Integer binaryInt=Integer.valueOf("1100101",2);

//        ParseXxx()
//          -> static method
//          -> Xxx can be replaced by any primitive type
//          -> it returns Xxx TYPE VALEU.
        int x=parseInt("123");
        double y=parseDouble("3.14");

//        xxxValue()
//          -> instance method of wrapper class
//          -> xxx can be replaced by any primitive type
//          -> returns corresponding primitive type;
        int num=it.intValue();

    }
}
