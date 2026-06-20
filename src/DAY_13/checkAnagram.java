package DAY_13;
import java.util.*;
public class checkAnagram {
    public static void main(String args[])
    {
       String str1="CAR";
       String str2="RAC";
       char ch[]=str1.toCharArray();
       char ch1[]=str2.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch1);
       String s1=new String(ch);
       String s2=new String(ch1);
       if(s1.equals(s2))
       {
           System.out.println("GIVEN IS ANAGRAM ");
       }
       else{
           System.out.println("NOT A ANAGRAM ");
       }

    }
}
