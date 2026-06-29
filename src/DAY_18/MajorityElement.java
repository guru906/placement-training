package DAY_18;

public class MajorityElement {
    public static void main(String args[])
    {
        int arr[]={1,1,1,2,2,1,2,2,2};
        int max=0;int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
