package DAY_20;
import java.util.*;
public class triangle_star {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j||i==n||j==1){
                    System.out.print("*");

                }
                else System.out.print(" ");

            }
        System.out.println();
    }
    }
}
