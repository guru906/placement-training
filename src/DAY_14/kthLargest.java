package DAY_14;
import java.util.*;
public class kthLargest {
    public static void main(String args[])
    {
        int arr[]={1,3,5,6,4,7,8,100};
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-k]);
    }
}
