package DAY_05;
import java.util.*;
public class withArgwithoutRet {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        sum(a,b);
    }
    public static void sum(int a,int b)
    {
        System.out.println("ADD IS : "+(a+b));
    }
}
