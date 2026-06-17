package DAY_09;

public class CaseConversion {
    public static void main(String[]args)
    {
        String a="JAVA";
        String b="jAva";
        a=a.toLowerCase();
        System.out.println(a);
        b=b.toLowerCase();
        System.out.println(b);
        System.out.println(a.equalsIgnoreCase(b));
    }
}
