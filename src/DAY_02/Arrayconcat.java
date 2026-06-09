package DAY_02;
import java.util.Arrays;
public class Arrayconcat {
    public static void  main(String args[])
    {
        int nums[]={1,2,1};
        int n =nums.length;
        int a=2*nums.length;
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=nums[i%n];
        }
        System.out.println(Arrays.toString(arr));
    }
}
