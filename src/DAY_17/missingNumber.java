package DAY_17;

public class missingNumber {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,6};
        int index=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=index)
            {
                System.out.println("missing number is "+index);
                System.out.println("Repeated number is "+arr[i]);
            }
            index++;
        }
    }
}
