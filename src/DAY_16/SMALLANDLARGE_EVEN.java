package DAY_16;
import java.util.*;
public class SMALLANDLARGE_EVEN {
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        int[]arr={22,3,5,99,200,22,44,97,300};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                list.add(arr[i]);
            }
        }
        int[]temp=new int[arr.length];
        int j=0;
        for(int num:list)
        {
            temp[j]=num;
            j++;
        }
           System.out.println("small even Number "+temp[0]);
        System.out.println("large even Number "+temp[j-1]);


    }
}
