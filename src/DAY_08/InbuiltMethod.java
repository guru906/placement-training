package DAY_08;
import java.util.*;
public class InbuiltMethod {
    public static void main(String args[])
    {
        String str="   john_Doe_IT_55000     ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.replace("_"," "));
        System.out.println(Arrays.toString(str.split("_")));
        System.out.println(str.substring(0,6));
    }
}
