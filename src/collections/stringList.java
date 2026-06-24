package collections;
import java.util.*;
public class stringList {
    public static void main(String args[])
    {
        ArrayList<String>list=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            String name=scan.nextLine();
            list.add(name);
        }
        System.out.println(list);
    }
}
