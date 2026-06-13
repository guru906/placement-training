package DAY_06;
import java.util.*;
public class shapes {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int length=scan.nextInt();
        int breadth=scan.nextInt();
        int result = findArea(length,breadth);
        System.out.print(result);
    }
    public static int findArea(int length,int breadth)
    {
        int area =length*breadth;
        return area;
    }
}