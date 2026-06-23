package DAY_14;
import java.util.*;
public class leader {
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)

        {
            arr[i]=scan.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        int max=Integer.MIN_VALUE;

        int l=0;
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
