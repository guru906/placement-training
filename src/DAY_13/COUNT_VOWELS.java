package DAY_13;

public class COUNT_VOWELS {
    public static void main(String args[])
    {
        String str="AEjiofu";
        str=str.toLowerCase();
        char chh[]=str.toCharArray();
        int vowels=0;
        int cons=0;

        for(int i=0;i<chh.length;i++)
        {
            char ch=chh[i];
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels=vowels+1;
            }
            else{
                cons=cons+1;
            }
        }
        System.out.println("vowels : "+vowels);
        System.out.println("consonants "+cons);


    }
}
