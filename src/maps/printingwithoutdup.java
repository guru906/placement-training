package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class printingwithoutdup {
    public static void main(String args[])
    {
        Map<Character,Integer> map=new LinkedHashMap<>();
        String s="vishnuvishva";
        int i=0;
        for(char c:s.toCharArray())
        {
            map.put(c,1);
            i++;
        }
        for(char c:map.keySet())
        System.out.print(c+" ");
    }
}
