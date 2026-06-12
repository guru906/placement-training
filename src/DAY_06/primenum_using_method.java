package DAY_06;
import java.util.*;
public class primenum_using_method {
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        boolean result =isprime(n);
        System.out.println(result);

    }
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        else{
            for(int i=2;i<n;i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }return true;
    }
}
