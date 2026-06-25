package collections;

import java.util.*;

public class remevedup {
    public static void main(String args[])
    {
        int arr[]={1,2,2,3,4,4,5};

        Set<Integer>set=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
