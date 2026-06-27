package DAY_17;
import java.util.*;
public class MaximumSubArraySum {
    public static void main(String args[])
    {
        int arr[]={-2,-3,4,-2,-1,1,5,-3};
        int start=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int stind=-1;
        int endind=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(sum==0)
            {
                start=i;
            }
            sum=sum+arr[i];
            if(max<sum)
            {
                max=sum;
                stind=start;
                endind=i;
            }
            if(sum<0)
            {
                sum=0;
            }

        }
        System.out.println("Maximum sum : "+max);
        System.out.println("start index : "+stind);
        System.out.println("end index "+endind);
        for(int i=stind;i<=endind;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
