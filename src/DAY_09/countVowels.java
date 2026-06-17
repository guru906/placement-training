package DAY_09;
import java.util.*;
public class countVowels {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String name =scan.nextLine();
         name=name.toLowerCase();
         int count =0;
         for(int i=0;i<name.length();i++)
         {
             char ch =name.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
             {
                 count =count+1;
             }

         }
        // System.out.println(name);
         System.out.println("it contains "+ count+" number of vowels.");
    }
}
