package DAY_14;

public class majority_element {

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,3,2,2,-1};

        int max = 0;
        int ans = -1;

        for(int i = 0; i < arr.length; i++)
        {
            int count = 1;

            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            if(count > max)
            {
                max = count;
                ans = arr[i];
            }
        }

        if(max > 1)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println("-1");
        }
    }
}