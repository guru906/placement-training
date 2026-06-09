package DAY_01;
import java.util.*;
public class ELECTRICITYBILL {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int bill = scan.nextInt();
        if(bill<=100)
        {
            System.out.println("ELECTRICITY BILL IS : "+(bill*5));
        }
        else if(bill>100 && bill<=200)
        {
            System.out.println("ELECTRICITY BILL IS : "+((100*5)+(bill-100)*7));
        }
        else{
            int ans =(100*5)+(100*7)+(bill-200)*10;

                System.out.println("ELECTRICITY BILL IS : "+ans);

        }
    }
}
