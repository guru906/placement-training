package collections;
import java.util.*;
public class uniqueWords {
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        String name=scan.nextLine();

        String[]arr=name.split(" ");

        Set<String>set=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
