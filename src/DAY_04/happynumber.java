package DAY_04;

public class happynumber {
    public static void main(String args[])
    {
        int num =7;
        while(num!=1 && num!=4)
        {
            int sum =0;
            while(num!=0)
            {
                int rem =num%10;
                sum =sum+rem*rem;
                num=num/10;
            }
            num =sum;
        }
        if(num ==1)
        {
            System.out.println("HAPPY NUMBER ");
        }
        else{
            System.out.println("NOT A HAPPY NUMBER ");
        }
    }
}
