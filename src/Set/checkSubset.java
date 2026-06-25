package Set;
import java.util.*;
public class checkSubset {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Set<Integer>set=new HashSet<>();
        Set<Integer>set1=new HashSet<>();

        int n1= scan.nextInt();
        int n2=scan.nextInt();
        for(int i=0;i<n1;i++)
        {
            set.add(scan.nextInt());
        }
        for(int i=0;i<n2;i++)
        {
            set1.add(scan.nextInt());
        }
        if(set.containsAll(set1))
        {
         System.out.println("Subset is present ");
        }
        else{
            System.out.println("Subset is not present ");
        }


    }
}
