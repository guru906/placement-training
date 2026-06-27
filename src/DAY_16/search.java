package DAY_16;
import java.util.*;
public class search {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER YOUR ARRAY SIZE ");

        int n=scan.nextInt();

        int arr[]=new int[n];
        System.out.println("ENTER YOUR ARRAYS ELEMENT ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("ENTER YOUR TARGET ");
        int target=scan.nextInt();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                index=i;
            }
        }
        System.out.println("LAST OCCURANCE ");
        System.out.println(index);
    }
}
