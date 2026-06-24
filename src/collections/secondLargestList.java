package collections;
import java.util.*;
public class secondLargestList {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(scan.nextInt());
        }
        int large=Integer.MIN_VALUE;
        int second=-1;
        for(int num:list)
        {
            if(num>large)
            {
                second=large;
                large=num;
            }
            else if(large>num &&second<num)
            {
                second=num;
            }
        }
        System.out.println("Second largest element is : "+second);
    }
}
