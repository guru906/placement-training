package DAY_20;
import java.util.*;
public class fibinacciSeries {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        {
            int num=scan.nextInt();
            int first=0;
            int second=1;
            for(int i=1;i<=num;i++)
            {
                System.out.print(first+" ");
                int next=first+second;
                first=second;
                second=next;
            }
        }
    }
}
