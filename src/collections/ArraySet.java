package collections;
import java.util.*;
public class ArraySet {
    public static void main(String args[])
    {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> set2=new HashSet<>(Arrays.asList(5,6,7,8,9,10));
//        set1.addAll(set2);
//        System.out.println(set1);
        set1.retainAll(set2);
       System.out.println(set1);
        set1.removeAll(set2);
        System.out.print(set1);



    }
}
