package DAY_07;
import java.util.*;
public class Average {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int arr[]=new int[n];
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            count = count+arr[i];
        }
        System.out.println("AVERAGE IS : "+(count/n));
    }
}
