package DAY_17;
import java.util.*;
public class remeoveDuplicates {
    public static void main(String args[])
    {
        int arr[]={1,1,2,3,5,5,6,7,1,1,2,3,5};
        Set<Integer>set=new LinkedHashSet<>();
        for(int nums:arr)
        {
            set.add(nums);
        }
        System.out.println(set);
    }
}
