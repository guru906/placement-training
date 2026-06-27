package DAY_17;

public class sorted {
    public static void main(String args[])
    {
        int arr[]={1,3,14,5,6,8};
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]<arr[i])
            {

            }
            else{
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("array is sorted");
    }
}
