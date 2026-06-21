package BATCH_TEST_PRACTISE;

import java.util.Arrays;

public class rightRotation {
    public static void main(String args[])
    {
        int []arr={1,2,3,4,5};
        int n=arr.length-1;
        int temp=arr[n];
        for(int i=n;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
