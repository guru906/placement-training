package DAY_12;
import java.util.*;
public class ReverseString{

    public static void main(String args[])
    {
        String name="abcdef";
        char[]ch=name.toCharArray();
        int n=ch.length-1;
        char[]ans=new char[name.length()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=ch[n-i];
        }
        String answer=new String(ans);
        System.out.println(answer);
    }
}
