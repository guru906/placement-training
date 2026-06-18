public class bubbleSort {
    public static void main(String args[])
    {
        int arr[]={1,5,3,2,8,6};
        for(int i=0;i<arr.length; i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1 ])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("AFTER SORTED THE ARRAY ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
