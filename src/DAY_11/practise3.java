package DAY_11;
import java.util.*;
// REVERSE THE ARRAYS
public class practise3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        int start=0;
        int last =arr.length-1;
        while(start<=last)
        {
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;

        }
        System.out.println(Arrays.toString(arr));
    }
}