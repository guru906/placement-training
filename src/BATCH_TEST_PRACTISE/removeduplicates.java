package BATCH_TEST_PRACTISE;

public class removeduplicates {
    public static void main(String args[])
    {
        int arr[]={1,1,1,2,2,2,3,3,33,4,5};
        if(arr.length==0)
        {
            System.out.println("0");
        }
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
        int ans=j+1;
        for(int i=0;i<ans ;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
