package DAY_18;
import java.util.*;
public class leaders {
    public static void main(String args[])
    {
        int arr[]={16,17,3,4,5,2};
        int max=Integer.MIN_VALUE;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
