package DAY_17;
import java.util.*;
public class Rotate_by_k {
    public static void main(String args[])
    {
        int arr[]={1,2,3,5,6,7,8,4,5,6};
        int k=3;
        int temp[]=new int[k];
        for(int j=0;j<temp.length;j++)
        {
            temp[j]=arr[j];
        }
        for(int i=k;i<arr.length;i++)
        {
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++)
        {
            arr[i]=temp[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
