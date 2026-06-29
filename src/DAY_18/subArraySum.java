package DAY_18;

public class subArraySum {
    public static void main(String args[])
    {
        int arr[]={-2,-3,4,-2,-1,1,5,-3};
        int start=0;
        int max=Integer.MIN_VALUE;
        int startind=-1;
        int endind=-1;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum==0)
            {
                start=i;
            }
            sum=sum+arr[i];
            if(sum>max)
            {
                max=sum;
                startind=start;
                endind=i;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println("Maximum sum = "+max);
        System.out.println("SubArray is : ");
        for(int i=startind;i<=endind;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
