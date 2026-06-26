package maps;
import java.util.*;
public class getdefaultMethod {
    public static void main(String args[])
    { String s="varshinivars";
        Map<Character,Integer>map=new HashMap<>();

        for(char c:s.toCharArray())

            map.put(c,map.getOrDefault(c,0)+1);

        for(char c:s.toCharArray())
        {
            if(map.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }
    }
}
