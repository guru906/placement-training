package Set;
import java.util.*;
public class removeDuplicates {
    public static void main(String args[])
    {
        Set<Integer>set=new HashSet<>();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            set.add(scan.nextInt());
        }
        for(int num:set)
        {
            System.out.print(num+" ");
        }

    }
}
