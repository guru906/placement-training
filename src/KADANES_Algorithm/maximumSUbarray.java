package KADANES_Algorithm;

public class maximumSUbarray {
    public static void main(String args[])
    {
        int arr[]={-2,-3,4,-2,-1,1,5,-3};
        int sum=0;
        int max=Integer.MIN_VALUE;

        int start=0;
        int ansStart=-1;
        int end=-1;
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
                ansStart=start;
                end=i;
            }
            if(sum<0)
            {
                sum=0;
            }
        }

        System.out.println("Maximum Sum = " + max);
        System.out.println("Start Index = " + ansStart);
        System.out.println("End Index = " + end);

        System.out.print("Subarray: ");
        for (int i = ansStart; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
