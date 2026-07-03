package DAY_20;
import java.util.*;
public class shuffledArray {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int num[]={4,3,2,0,1};
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[num[i]]=arr[i];
        }
        System.out.println(Arrays.toString(temp));

    }
}
