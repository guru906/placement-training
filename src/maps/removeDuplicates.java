package maps;
import java.util.*;
public class removeDuplicates {
    public static void main(String args[])
    {
        Map<Character,Integer>map=new LinkedHashMap<>();
        String s="vishnuvishva";
        int i=0;
        for(char c:s.toCharArray())
        {
            map.put(c,1);
            i++;
        }
        System.out.println(map);
    }
}
