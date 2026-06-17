package DAY_09;
import java.util.*;
public class CONSONENTS {
    public static void main(String args[])
    {
        String str ="VSB ENGINEERING COLLEGE";

        str=str.toLowerCase();
        int count =0;
        str =str.replace(" ","");


        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {

            }
            else{
                count = count+1;
            }

        }
        System.out.println("CONSONENTS ELEMENT IS : "+count);
        System.out.println("TOTAL CHARACTER : "+str.length());
    }
}
