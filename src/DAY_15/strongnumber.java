package DAY_15;
import java.util.*;
public class strongnumber {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int mul=1;
            int rem =temp%10;
            for(int i=1;i<=rem;i++)
            {
                mul=mul*i;
            }
            sum=sum+mul;
            temp=temp/10;
        }
        if(num==sum)
        {
            System.out.println("Strong number ");
        }
        else{
            System.out.println("Not a strong number ");
        }
    }
}
