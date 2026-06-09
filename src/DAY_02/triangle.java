package DAY_02;
import java.util.*;
public class triangle {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE SIDE 1 : ");
        int s1=scan.nextInt();
        System.out.println("ENTER THE SIDE 2 : ");
        int s2=scan.nextInt();
        System.out.println("ENTER THE SIDE 3 : ");
        int s3 =scan.nextInt();
        if(s1==s2&&s2==s3)
        {
            System.out.println("EQUILATERAL TRIANGLE ");
        }
        else if(s1==s2||s2==s3||s3==s1)
        {
            System.out.println("ISOLATERAL TRIANGLE ");
        }
        else{
            System.out.println("SCALENE TRIANGLE ");
        }
    }
}
