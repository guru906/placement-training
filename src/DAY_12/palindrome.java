package DAY_12;

public class palindrome {
    public static void main(String args[])
    {
        String name="APPA";
        char ch[]=name.toCharArray();
        char chh[]=new char[ch.length];
        int n=ch.length-1;
        for(int i=0;i<ch.length;i++)
        {
            chh[i]=ch[n-i];
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=chh[i])
            {
                System.out.println("NOT A PALINDROME ");
                return;
            }
        }
        System.out.println("PALINDROME ");
    }
}
