package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequency {
    public static void main(String args[])
    {
        Map<Character,Integer> map=new LinkedHashMap<>();
        String s="vishnuvishva";

        for(char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}
