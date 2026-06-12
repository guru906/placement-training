package DAY_06;
import java.util.*;
public class factorial {
    public static void main(String args[]) {
        int result =factorials();
        System.out.println("factorial is : "+result);

    }
    public static int factorials()
    {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        int sum =1;
        for(int i=1;i<=num;i++)
        {
            sum = sum*i;
        }
        return sum;
    }
}
