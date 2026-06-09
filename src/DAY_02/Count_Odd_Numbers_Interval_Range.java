package DAY_02;
import java.util.*;
public class Count_Odd_Numbers_Interval_Range {
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        int count =0;
        System.out.println("ENTER THE START VALUE : ");
        int a =scan.nextInt();
        System.out.println("ENTER THE END VALUE : ");
        int b =scan.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%2!=0)
            {
                count = count+1;
            }
        }
        System.out.println("Odd count is : "+count);
    }
}
