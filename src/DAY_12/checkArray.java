package DAY_12;
import java.util.*;
public class checkArray {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                System.out.println("Array is not sorted ");
                return;
            }
        }
        System.out.println("Array is sorted ");
    }
}
