package BATCH_TEST_PRACTISE;
import java.util.*;
public class MoveZeroesToEnd {
    public static void main(String args[])
    {
        int arr[]={1,2,0,5,9,0,4,0,3,0};
        int n=arr.length;
        int temp[]=new int[n];
        int j=0;
        // copy the non zero element
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }
        //store the original array in first without zeros
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
