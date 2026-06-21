package BATCH_TEST_PRACTISE;
import java.util.*;
public class ARRAYshift_by_Kth {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int d=4;
        int n=arr.length;
        // create temp to store the d th value
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        //shift remaining in to the first
        for(int i=d;i<arr.length;i++)
        {
            arr[i-d]=arr[i];
        }
        //push back in to the temp in left
        int j=0;
        for(int i= n-d;i<arr.length;i++)
        {
            arr[i]=temp[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
