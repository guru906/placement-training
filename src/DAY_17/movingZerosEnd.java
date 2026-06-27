package DAY_17;
import java.util.*;
public class movingZerosEnd {
    public static void main(String args[])
    {
        int arr[]={1,0,2,0,3,0,4,0,7,0};
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
