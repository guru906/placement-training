package DAY_11;
import java.util.*;
// FIND LARGEST ELEMENT IN AN ARRAY
public class practise {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();

        }
        int large=0;
        for(int i=0;i<arr.length;i++)
        {
            if(large<arr[i])
            {
                large =arr[i];
            }
        }
        System.out.println("largest element is : "+large);
    }
}
