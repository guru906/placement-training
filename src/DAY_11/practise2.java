package DAY_11;
import java.util.*;
//FIND SECOND LARGEST ELEMENT IN AN ARRAY
public class practise2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();

        }
        int large=arr[0];
        int second=0;
        for(int i=0;i<arr.length;i++)
        {
            if(large<arr[i])
            {
                second =large;
                large =arr[i];
            }

            else if(large>arr[i]&&second<arr[i])
            {
                second = arr[i];
            }
        }
        System.out.println(" second largest element is : "+second);
    }
}
